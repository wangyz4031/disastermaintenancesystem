package com.bjjw.dmsmaintenanceservice.serviceimpl;

import com.bjjw.dmsmaintenanceservice.service.BaseInfoService;
import org.springframework.data.domain.Sort;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlServiceImpl<T> implements BaseInfoService {

    @Override
    public long getAllCount() {
        //读取传入的路径，返回一个document对象
        NodeList nodeList = getNodeList();
        return nodeList.getLength();
    }

    @Override
    public List<T> queryAllByLimit(int page, int limit) {
        try {
            List<T> tList = findAll();
            int endIndex;
            if (page * limit > tList.size()) {
                endIndex = tList.size();
            } else {
                endIndex = page * limit;
            }
            Sort(tList);
            tList = tList.subList((page - 1) * limit, endIndex);
            return tList;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public T findById(String id) {
        //读取传入的路径，返回一个document对象
        Document document = loadInit(getFilePath());
        //获取叶节点
        NodeList nodeList = document.getElementsByTagName("Table");
        //遍历叶节点
        for (int i = 0; i < nodeList.getLength(); i++) {
            T t = getEntityByXmlFile(document, i);
            if(isExist(t,id)) {
                return t;
            }
        }
        return null;
    }


    @Override
    public boolean save(Object object) {
        T newEntity = (T) object;
        Document document = loadInit(getFilePath());
        try {
            //获取叶节点
            NodeList nodeList = document.getElementsByTagName("Table");
            //遍历叶节点
            for (int i = 0; i < nodeList.getLength(); i++) {
                T originalEntity = getEntityByXmlFile(document, i);
                if(isExist(newEntity,originalEntity)){
                    return updateXML(newEntity,originalEntity,document,i);
                }

            }
            return addXML(newEntity,document);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteById(String id) {
        //读取传入的路径，返回一个document对象
        Document document = loadInit(getFilePath());
        //获取叶节点
        NodeList nodeList = document.getElementsByTagName("Table");
        //遍历叶节点
        for (int i = 0; i < nodeList.getLength(); i++) {
            T t = getEntityByXmlFile(document, i);
            if(isExist(t,id)){
                removeNode(document, nodeList, i);
                return true;
            }
        }
        return false;
    }

    protected void removeNode(Document document, NodeList nodeList, int i) {
        Node node = nodeList.item(i);
        node.getParentNode().removeChild(node);
        saveXML(document, getFilePath());
    }

    protected NodeList getNodeList() {
        //读取传入的路径，返回一个document对象
        Document document = loadInit(getFilePath());
        //获取叶节点
        return document.getElementsByTagName("Table");
    }

    @Override
    public List<T> findAll() {
        List<T> tList = new ArrayList<T>();
        Document document = loadInit(getFilePath());
        //获取叶节点
        NodeList nodeList = document.getElementsByTagName("Table");
        //遍历叶节点
        for (int i = 0; i < nodeList.getLength(); i++) {
            T t = getEntityByXmlFile(document, i);
            tList.add(t);
        }
        return tList;
    }

    @Override
    public List<T>  findMonitorPointEntitiesBySensorType(int sensorType, Sort sort) {
        return null;
    }

    protected T getEntityByXmlFile(Document document,int i){
        return null;
    }

    //读取传入的路径，返回一个document对象
    public Document loadInit(String filePath){
        Document document = null;
        try{
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(new File(filePath));
            document.normalize();
            return document;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean saveXML(Document document, String filePath){
        try{
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
    }
    protected String getFilePath(){
        return "";
    }

    protected void Sort(List<T> tList){
        return;
    }
    protected boolean isExist(T t,String id){
        return false;
    }

    protected boolean isExist(T t,T t1){
        return false;
    }

    protected boolean updateXML(T newEntity ,T originalEntity,Document document,int i){
        return false;
    }

    protected boolean addXML(T newEntity,Document document){
        return false;
    }

    protected Node getNodeByPropertyName(NodeList nodeList,String propertyName){
        for (int j=0;j<nodeList.getLength();j++) {
            Node node=nodeList.item(j);
            if(node.getNodeName().equals(propertyName)){
                return node;
            }
        }
        return null;
    }
}
