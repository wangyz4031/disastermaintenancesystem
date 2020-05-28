
package com.bjjw.dmsmaintenanceservice.webservice;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the JavaSrc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MonitorUnitDeviceStatusEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "MonitorUnitDeviceStatusEntity");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _SnowDataEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "SnowDataEntity");
    private final static QName _StatusEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "StatusEntity");
    private final static QName _SnowSensorStatusEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "SnowSensorStatusEntity");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _RainSensorStatusEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "RainSensorStatusEntity");
    private final static QName _SensorType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "SensorType");
    private final static QName _DataEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "DataEntity");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _CMDType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "CMDType");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DeviceStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "DeviceStatus");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _NodeWorkMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "NodeWorkMode");
    private final static QName _WindSensorStatusEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "WindSensorStatusEntity");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _CMDEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "CMDEntity");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _DeviceCommStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "DeviceCommStatus");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _MonitorDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "MonitorDataType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Entity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Entity");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _RainDataEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "RainDataEntity");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _WindDataEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "WindDataEntity");
    private final static QName _DoubleSensorStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Core", "DoubleSensorStatus");
    private final static QName _MonitorUnitDeviceStatusEntityUps1InputVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups1InputVoltage");
    private final static QName _MonitorUnitDeviceStatusEntityUps2OutputVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups2OutputVoltage");
    private final static QName _MonitorUnitDeviceStatusEntityUps1OutputVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups1OutputVoltage");
    private final static QName _MonitorUnitDeviceStatusEntityUps2InputVoltage_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups2InputVoltage");
    private final static QName _MonitorUnitDeviceStatusEntityUps1DumpEnergy_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups1DumpEnergy");
    private final static QName _MonitorUnitDeviceStatusEntityUps2DumpEnergy_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Ups2DumpEnergy");
    private final static QName _DHandleRainSensorStatusNodeId_QNAME = new QName("http:/DST_V2/AccessBus", "nodeId");
    private final static QName _DHandleRainSensorStatusRainSensorStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "rainSensorStatusStr");
    private final static QName _DHandleSnowSensorStatusSnowSensorStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "snowSensorStatusStr");
    private final static QName _DHandleMonitorUnitDeviceStatusMonitorUnitDeviceStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "monitorUnitDeviceStatusStr");
    private final static QName _AHandlEnvironmentDataEnvironmentDataStr_QNAME = new QName("http:/DST_V2/AccessBus", "environmentDataStr");
    private final static QName _BHandleForeignMatterAlarmForeignMatterAlarmStr_QNAME = new QName("http:/DST_V2/AccessBus", "foreignMatterAlarmStr");
    private final static QName _FHandleForeignMonitorDataDataEntity_QNAME = new QName("http:/DST_V2/AccessBus", "dataEntity");
    private final static QName _FHandleForeignMonitorDataStatusEntity_QNAME = new QName("http:/DST_V2/AccessBus", "statusEntity");
    private final static QName _FHandleForeignMonitorDataMonitorUnitEntity_QNAME = new QName("http:/DST_V2/AccessBus", "monitorUnitEntity");
    private final static QName _BHandleEarthQuakeAlarmEarthQuakeAlarmStr_QNAME = new QName("http:/DST_V2/AccessBus", "earthQuakeAlarmStr");
    private final static QName _EUpLoadSnowDepthImageMonitorUnitCode_QNAME = new QName("http:/DST_V2/AccessBus", "monitorUnitCode");
    private final static QName _EUpLoadSnowDepthImageSnowDepthImageStr_QNAME = new QName("http:/DST_V2/AccessBus", "snowDepthImageStr");
    private final static QName _EUpLoadSnowDepthImageInterfaceGateId_QNAME = new QName("http:/DST_V2/AccessBus", "interfaceGateId");
    private final static QName _EUpLoadSnowDepthImageLineCode_QNAME = new QName("http:/DST_V2/AccessBus", "lineCode");
    private final static QName _EUpLoadSnowDepthImageBureauCode_QNAME = new QName("http:/DST_V2/AccessBus", "bureauCode");
    private final static QName _EUpLoadSnowDepthImageClientId_QNAME = new QName("http:/DST_V2/AccessBus", "clientId");
    private final static QName _EUpLoadSnowDepthImageMonitorPointCode_QNAME = new QName("http:/DST_V2/AccessBus", "monitorPointCode");
    private final static QName _CMDEntityMonitorUnitBIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "MonitorUnitBIP");
    private final static QName _CMDEntityMonitorUnitAIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "MonitorUnitAIP");
    private final static QName _GGetLineCodeResponseGGetLineCodeResult_QNAME = new QName("http:/DST_V2/AccessBus", "G_GetLineCodeResult");
    private final static QName _AHandleWindDataWindDataStr_QNAME = new QName("http:/DST_V2/AccessBus", "windDataStr");
    private final static QName _DataEntitySpeed_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Speed");
    private final static QName _DataEntityBureauName_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "BureauName");
    private final static QName _DataEntityLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Level");
    private final static QName _DHandleWindSensorStatusWindSensorStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "windSensorStatusStr");
    private final static QName _EntityMonitorPointCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "MonitorPointCode");
    private final static QName _EntityLineCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "LineCode");
    private final static QName _EntityMonitorUnitCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "MonitorUnitCode");
    private final static QName _EntityBureauCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "BureauCode");
    private final static QName _EntityLineName_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "LineName");
    private final static QName _EntityId_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "Id");
    private final static QName _DHandleEarthQuakeRelayStatusEarthQuakeRelayStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "earthQuakeRelayStatusStr");
    private final static QName _DHandleForeignMatterRelayStatusForeignMatterRelayStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "foreignMatterRelayStatusStr");
    private final static QName _CRemoteCMDControlCmdEntiy_QNAME = new QName("http:/DST_V2/AccessBus", "cmdEntiy");
    private final static QName _DHandleEarthQuakeSensorStatusEarthQuakeSensorStatusStr_QNAME = new QName("http:/DST_V2/AccessBus", "earthQuakeSensorStatusStr");
    private final static QName _GSendSpecifiedRainDataRainDataStr_QNAME = new QName("http:/DST_V2/AccessBus", "rainDataStr");
    private final static QName _GGetBureaCodeResponseGGetBureaCodeResult_QNAME = new QName("http:/DST_V2/AccessBus", "G_GetBureaCodeResult");
    private final static QName _AHandlSnowDataSnowDataStr_QNAME = new QName("http:/DST_V2/AccessBus", "snowDataStr");
    private final static QName _StatusEntityAlarmDes_QNAME = new QName("http://schemas.datacontract.org/2004/07/CoreLib.Entity", "AlarmDes");
    private final static QName _CCMDControlCmdStr_QNAME = new QName("http:/DST_V2/AccessBus", "cmdStr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: JavaSrc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CRemoteCMDControl }
     * 
     */
    public CRemoteCMDControl createCRemoteCMDControl() {
        return new CRemoteCMDControl();
    }

    /**
     * Create an instance of {@link CMDEntity }
     * 
     */
    public CMDEntity createCMDEntity() {
        return new CMDEntity();
    }

    /**
     * Create an instance of {@link DHandleMonitorUnitDeviceStatus }
     * 
     */
    public DHandleMonitorUnitDeviceStatus createDHandleMonitorUnitDeviceStatus() {
        return new DHandleMonitorUnitDeviceStatus();
    }

    /**
     * Create an instance of {@link DHandleMonitorUnitDeviceStatusResponse }
     * 
     */
    public DHandleMonitorUnitDeviceStatusResponse createDHandleMonitorUnitDeviceStatusResponse() {
        return new DHandleMonitorUnitDeviceStatusResponse();
    }

    /**
     * Create an instance of {@link GGetBureaCode }
     * 
     */
    public GGetBureaCode createGGetBureaCode() {
        return new GGetBureaCode();
    }

    /**
     * Create an instance of {@link GGetLineCode }
     * 
     */
    public GGetLineCode createGGetLineCode() {
        return new GGetLineCode();
    }

    /**
     * Create an instance of {@link AHandlEnvironmentData }
     * 
     */
    public AHandlEnvironmentData createAHandlEnvironmentData() {
        return new AHandlEnvironmentData();
    }

    /**
     * Create an instance of {@link DHandleWindSensorStatusResponse }
     * 
     */
    public DHandleWindSensorStatusResponse createDHandleWindSensorStatusResponse() {
        return new DHandleWindSensorStatusResponse();
    }

    /**
     * Create an instance of {@link DHandleForeignMatterRelayStatus }
     * 
     */
    public DHandleForeignMatterRelayStatus createDHandleForeignMatterRelayStatus() {
        return new DHandleForeignMatterRelayStatus();
    }

    /**
     * Create an instance of {@link AHandlEnvironmentDataResponse }
     * 
     */
    public AHandlEnvironmentDataResponse createAHandlEnvironmentDataResponse() {
        return new AHandlEnvironmentDataResponse();
    }

    /**
     * Create an instance of {@link EUpLoadSnowDepthImage }
     * 
     */
    public EUpLoadSnowDepthImage createEUpLoadSnowDepthImage() {
        return new EUpLoadSnowDepthImage();
    }

    /**
     * Create an instance of {@link CRemoteCMDControlResponse }
     * 
     */
    public CRemoteCMDControlResponse createCRemoteCMDControlResponse() {
        return new CRemoteCMDControlResponse();
    }

    /**
     * Create an instance of {@link DHandleEarthQuakeSensorStatusResponse }
     * 
     */
    public DHandleEarthQuakeSensorStatusResponse createDHandleEarthQuakeSensorStatusResponse() {
        return new DHandleEarthQuakeSensorStatusResponse();
    }

    /**
     * Create an instance of {@link GSendSpecifiedRainData }
     * 
     */
    public GSendSpecifiedRainData createGSendSpecifiedRainData() {
        return new GSendSpecifiedRainData();
    }

    /**
     * Create an instance of {@link GSendSpecifiedRainDataResponse }
     * 
     */
    public GSendSpecifiedRainDataResponse createGSendSpecifiedRainDataResponse() {
        return new GSendSpecifiedRainDataResponse();
    }

    /**
     * Create an instance of {@link AHandleWindData }
     * 
     */
    public AHandleWindData createAHandleWindData() {
        return new AHandleWindData();
    }

    /**
     * Create an instance of {@link DHandleEarthQuakeRelayStatus }
     * 
     */
    public DHandleEarthQuakeRelayStatus createDHandleEarthQuakeRelayStatus() {
        return new DHandleEarthQuakeRelayStatus();
    }

    /**
     * Create an instance of {@link FHandleForeignMonitorData }
     * 
     */
    public FHandleForeignMonitorData createFHandleForeignMonitorData() {
        return new FHandleForeignMonitorData();
    }

    /**
     * Create an instance of {@link DataEntity }
     * 
     */
    public DataEntity createDataEntity() {
        return new DataEntity();
    }

    /**
     * Create an instance of {@link StatusEntity }
     * 
     */
    public StatusEntity createStatusEntity() {
        return new StatusEntity();
    }

    /**
     * Create an instance of {@link MonitorUnitDeviceStatusEntity }
     * 
     */
    public MonitorUnitDeviceStatusEntity createMonitorUnitDeviceStatusEntity() {
        return new MonitorUnitDeviceStatusEntity();
    }

    /**
     * Create an instance of {@link FHandleForeignMonitorDataResponse }
     * 
     */
    public FHandleForeignMonitorDataResponse createFHandleForeignMonitorDataResponse() {
        return new FHandleForeignMonitorDataResponse();
    }

    /**
     * Create an instance of {@link DHandleSnowSensorStatus }
     * 
     */
    public DHandleSnowSensorStatus createDHandleSnowSensorStatus() {
        return new DHandleSnowSensorStatus();
    }

    /**
     * Create an instance of {@link BHandleForeignMatterAlarmResponse }
     * 
     */
    public BHandleForeignMatterAlarmResponse createBHandleForeignMatterAlarmResponse() {
        return new BHandleForeignMatterAlarmResponse();
    }

    /**
     * Create an instance of {@link BHandleEarthQuakeAlarmResponse }
     * 
     */
    public BHandleEarthQuakeAlarmResponse createBHandleEarthQuakeAlarmResponse() {
        return new BHandleEarthQuakeAlarmResponse();
    }

    /**
     * Create an instance of {@link CCMDControlResponse }
     * 
     */
    public CCMDControlResponse createCCMDControlResponse() {
        return new CCMDControlResponse();
    }

    /**
     * Create an instance of {@link AHandleRainData }
     * 
     */
    public AHandleRainData createAHandleRainData() {
        return new AHandleRainData();
    }

    /**
     * Create an instance of {@link GGetBureaCodeResponse }
     * 
     */
    public GGetBureaCodeResponse createGGetBureaCodeResponse() {
        return new GGetBureaCodeResponse();
    }

    /**
     * Create an instance of {@link AHandleRainDataResponse }
     * 
     */
    public AHandleRainDataResponse createAHandleRainDataResponse() {
        return new AHandleRainDataResponse();
    }

    /**
     * Create an instance of {@link AHandlSnowDataResponse }
     * 
     */
    public AHandlSnowDataResponse createAHandlSnowDataResponse() {
        return new AHandlSnowDataResponse();
    }

    /**
     * Create an instance of {@link DHandleRainSensorStatus }
     * 
     */
    public DHandleRainSensorStatus createDHandleRainSensorStatus() {
        return new DHandleRainSensorStatus();
    }

    /**
     * Create an instance of {@link DHandleWindSensorStatus }
     * 
     */
    public DHandleWindSensorStatus createDHandleWindSensorStatus() {
        return new DHandleWindSensorStatus();
    }

    /**
     * Create an instance of {@link DHandleEarthQuakeRelayStatusResponse }
     * 
     */
    public DHandleEarthQuakeRelayStatusResponse createDHandleEarthQuakeRelayStatusResponse() {
        return new DHandleEarthQuakeRelayStatusResponse();
    }

    /**
     * Create an instance of {@link EUpLoadSnowDepthImageResponse }
     * 
     */
    public EUpLoadSnowDepthImageResponse createEUpLoadSnowDepthImageResponse() {
        return new EUpLoadSnowDepthImageResponse();
    }

    /**
     * Create an instance of {@link BHandleForeignMatterAlarm }
     * 
     */
    public BHandleForeignMatterAlarm createBHandleForeignMatterAlarm() {
        return new BHandleForeignMatterAlarm();
    }

    /**
     * Create an instance of {@link AHandleWindDataResponse }
     * 
     */
    public AHandleWindDataResponse createAHandleWindDataResponse() {
        return new AHandleWindDataResponse();
    }

    /**
     * Create an instance of {@link DHandleEarthQuakeSensorStatus }
     * 
     */
    public DHandleEarthQuakeSensorStatus createDHandleEarthQuakeSensorStatus() {
        return new DHandleEarthQuakeSensorStatus();
    }

    /**
     * Create an instance of {@link AHandlSnowData }
     * 
     */
    public AHandlSnowData createAHandlSnowData() {
        return new AHandlSnowData();
    }

    /**
     * Create an instance of {@link DHandleForeignMatterRelayStatusResponse }
     * 
     */
    public DHandleForeignMatterRelayStatusResponse createDHandleForeignMatterRelayStatusResponse() {
        return new DHandleForeignMatterRelayStatusResponse();
    }

    /**
     * Create an instance of {@link CCMDControl }
     * 
     */
    public CCMDControl createCCMDControl() {
        return new CCMDControl();
    }

    /**
     * Create an instance of {@link GGetLineCodeResponse }
     * 
     */
    public GGetLineCodeResponse createGGetLineCodeResponse() {
        return new GGetLineCodeResponse();
    }

    /**
     * Create an instance of {@link DHandleSnowSensorStatusResponse }
     * 
     */
    public DHandleSnowSensorStatusResponse createDHandleSnowSensorStatusResponse() {
        return new DHandleSnowSensorStatusResponse();
    }

    /**
     * Create an instance of {@link BHandleEarthQuakeAlarm }
     * 
     */
    public BHandleEarthQuakeAlarm createBHandleEarthQuakeAlarm() {
        return new BHandleEarthQuakeAlarm();
    }

    /**
     * Create an instance of {@link DHandleRainSensorStatusResponse }
     * 
     */
    public DHandleRainSensorStatusResponse createDHandleRainSensorStatusResponse() {
        return new DHandleRainSensorStatusResponse();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link SnowDataEntity }
     * 
     */
    public SnowDataEntity createSnowDataEntity() {
        return new SnowDataEntity();
    }

    /**
     * Create an instance of {@link WindSensorStatusEntity }
     * 
     */
    public WindSensorStatusEntity createWindSensorStatusEntity() {
        return new WindSensorStatusEntity();
    }

    /**
     * Create an instance of {@link RainDataEntity }
     * 
     */
    public RainDataEntity createRainDataEntity() {
        return new RainDataEntity();
    }

    /**
     * Create an instance of {@link WindDataEntity }
     * 
     */
    public WindDataEntity createWindDataEntity() {
        return new WindDataEntity();
    }

    /**
     * Create an instance of {@link SnowSensorStatusEntity }
     * 
     */
    public SnowSensorStatusEntity createSnowSensorStatusEntity() {
        return new SnowSensorStatusEntity();
    }

    /**
     * Create an instance of {@link RainSensorStatusEntity }
     * 
     */
    public RainSensorStatusEntity createRainSensorStatusEntity() {
        return new RainSensorStatusEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorUnitDeviceStatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "MonitorUnitDeviceStatusEntity")
    public JAXBElement<MonitorUnitDeviceStatusEntity> createMonitorUnitDeviceStatusEntity(MonitorUnitDeviceStatusEntity value) {
        return new JAXBElement<MonitorUnitDeviceStatusEntity>(_MonitorUnitDeviceStatusEntity_QNAME, MonitorUnitDeviceStatusEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnowDataEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "SnowDataEntity")
    public JAXBElement<SnowDataEntity> createSnowDataEntity(SnowDataEntity value) {
        return new JAXBElement<SnowDataEntity>(_SnowDataEntity_QNAME, SnowDataEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "StatusEntity")
    public JAXBElement<StatusEntity> createStatusEntity(StatusEntity value) {
        return new JAXBElement<StatusEntity>(_StatusEntity_QNAME, StatusEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SnowSensorStatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "SnowSensorStatusEntity")
    public JAXBElement<SnowSensorStatusEntity> createSnowSensorStatusEntity(SnowSensorStatusEntity value) {
        return new JAXBElement<SnowSensorStatusEntity>(_SnowSensorStatusEntity_QNAME, SnowSensorStatusEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RainSensorStatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "RainSensorStatusEntity")
    public JAXBElement<RainSensorStatusEntity> createRainSensorStatusEntity(RainSensorStatusEntity value) {
        return new JAXBElement<RainSensorStatusEntity>(_RainSensorStatusEntity_QNAME, RainSensorStatusEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "SensorType")
    public JAXBElement<SensorType> createSensorType(SensorType value) {
        return new JAXBElement<SensorType>(_SensorType_QNAME, SensorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "DataEntity")
    public JAXBElement<DataEntity> createDataEntity(DataEntity value) {
        return new JAXBElement<DataEntity>(_DataEntity_QNAME, DataEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "CMDType")
    public JAXBElement<CMDType> createCMDType(CMDType value) {
        return new JAXBElement<CMDType>(_CMDType_QNAME, CMDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "DeviceStatus")
    public JAXBElement<DeviceStatus> createDeviceStatus(DeviceStatus value) {
        return new JAXBElement<DeviceStatus>(_DeviceStatus_QNAME, DeviceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeWorkMode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "NodeWorkMode")
    public JAXBElement<NodeWorkMode> createNodeWorkMode(NodeWorkMode value) {
        return new JAXBElement<NodeWorkMode>(_NodeWorkMode_QNAME, NodeWorkMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WindSensorStatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "WindSensorStatusEntity")
    public JAXBElement<WindSensorStatusEntity> createWindSensorStatusEntity(WindSensorStatusEntity value) {
        return new JAXBElement<WindSensorStatusEntity>(_WindSensorStatusEntity_QNAME, WindSensorStatusEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMDEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "CMDEntity")
    public JAXBElement<CMDEntity> createCMDEntity(CMDEntity value) {
        return new JAXBElement<CMDEntity>(_CMDEntity_QNAME, CMDEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCommStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "DeviceCommStatus")
    public JAXBElement<DeviceCommStatus> createDeviceCommStatus(DeviceCommStatus value) {
        return new JAXBElement<DeviceCommStatus>(_DeviceCommStatus_QNAME, DeviceCommStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "MonitorDataType")
    public JAXBElement<MonitorDataType> createMonitorDataType(MonitorDataType value) {
        return new JAXBElement<MonitorDataType>(_MonitorDataType_QNAME, MonitorDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RainDataEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "RainDataEntity")
    public JAXBElement<RainDataEntity> createRainDataEntity(RainDataEntity value) {
        return new JAXBElement<RainDataEntity>(_RainDataEntity_QNAME, RainDataEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WindDataEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "WindDataEntity")
    public JAXBElement<WindDataEntity> createWindDataEntity(WindDataEntity value) {
        return new JAXBElement<WindDataEntity>(_WindDataEntity_QNAME, WindDataEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleSensorStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Core", name = "DoubleSensorStatus")
    public JAXBElement<DoubleSensorStatus> createDoubleSensorStatus(DoubleSensorStatus value) {
        return new JAXBElement<DoubleSensorStatus>(_DoubleSensorStatus_QNAME, DoubleSensorStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups1InputVoltage", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps1InputVoltage(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps1InputVoltage_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups2OutputVoltage", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps2OutputVoltage(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps2OutputVoltage_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups1OutputVoltage", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps1OutputVoltage(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps1OutputVoltage_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups2InputVoltage", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps2InputVoltage(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps2InputVoltage_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups1DumpEnergy", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps1DumpEnergy(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps1DumpEnergy_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Ups2DumpEnergy", scope = MonitorUnitDeviceStatusEntity.class)
    public JAXBElement<String> createMonitorUnitDeviceStatusEntityUps2DumpEnergy(String value) {
        return new JAXBElement<String>(_MonitorUnitDeviceStatusEntityUps2DumpEnergy_QNAME, String.class, MonitorUnitDeviceStatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleRainSensorStatus.class)
    public JAXBElement<String> createDHandleRainSensorStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleRainSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "rainSensorStatusStr", scope = DHandleRainSensorStatus.class)
    public JAXBElement<String> createDHandleRainSensorStatusRainSensorStatusStr(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusRainSensorStatusStr_QNAME, String.class, DHandleRainSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleSnowSensorStatus.class)
    public JAXBElement<String> createDHandleSnowSensorStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleSnowSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "snowSensorStatusStr", scope = DHandleSnowSensorStatus.class)
    public JAXBElement<String> createDHandleSnowSensorStatusSnowSensorStatusStr(String value) {
        return new JAXBElement<String>(_DHandleSnowSensorStatusSnowSensorStatusStr_QNAME, String.class, DHandleSnowSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleMonitorUnitDeviceStatus.class)
    public JAXBElement<String> createDHandleMonitorUnitDeviceStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleMonitorUnitDeviceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "monitorUnitDeviceStatusStr", scope = DHandleMonitorUnitDeviceStatus.class)
    public JAXBElement<String> createDHandleMonitorUnitDeviceStatusMonitorUnitDeviceStatusStr(String value) {
        return new JAXBElement<String>(_DHandleMonitorUnitDeviceStatusMonitorUnitDeviceStatusStr_QNAME, String.class, DHandleMonitorUnitDeviceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = AHandlEnvironmentData.class)
    public JAXBElement<String> createAHandlEnvironmentDataNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, AHandlEnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "environmentDataStr", scope = AHandlEnvironmentData.class)
    public JAXBElement<String> createAHandlEnvironmentDataEnvironmentDataStr(String value) {
        return new JAXBElement<String>(_AHandlEnvironmentDataEnvironmentDataStr_QNAME, String.class, AHandlEnvironmentData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = BHandleForeignMatterAlarm.class)
    public JAXBElement<String> createBHandleForeignMatterAlarmNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, BHandleForeignMatterAlarm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "foreignMatterAlarmStr", scope = BHandleForeignMatterAlarm.class)
    public JAXBElement<String> createBHandleForeignMatterAlarmForeignMatterAlarmStr(String value) {
        return new JAXBElement<String>(_BHandleForeignMatterAlarmForeignMatterAlarmStr_QNAME, String.class, BHandleForeignMatterAlarm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "dataEntity", scope = FHandleForeignMonitorData.class)
    public JAXBElement<DataEntity> createFHandleForeignMonitorDataDataEntity(DataEntity value) {
        return new JAXBElement<DataEntity>(_FHandleForeignMonitorDataDataEntity_QNAME, DataEntity.class, FHandleForeignMonitorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "statusEntity", scope = FHandleForeignMonitorData.class)
    public JAXBElement<StatusEntity> createFHandleForeignMonitorDataStatusEntity(StatusEntity value) {
        return new JAXBElement<StatusEntity>(_FHandleForeignMonitorDataStatusEntity_QNAME, StatusEntity.class, FHandleForeignMonitorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitorUnitDeviceStatusEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "monitorUnitEntity", scope = FHandleForeignMonitorData.class)
    public JAXBElement<MonitorUnitDeviceStatusEntity> createFHandleForeignMonitorDataMonitorUnitEntity(MonitorUnitDeviceStatusEntity value) {
        return new JAXBElement<MonitorUnitDeviceStatusEntity>(_FHandleForeignMonitorDataMonitorUnitEntity_QNAME, MonitorUnitDeviceStatusEntity.class, FHandleForeignMonitorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = BHandleEarthQuakeAlarm.class)
    public JAXBElement<String> createBHandleEarthQuakeAlarmNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, BHandleEarthQuakeAlarm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "earthQuakeAlarmStr", scope = BHandleEarthQuakeAlarm.class)
    public JAXBElement<String> createBHandleEarthQuakeAlarmEarthQuakeAlarmStr(String value) {
        return new JAXBElement<String>(_BHandleEarthQuakeAlarmEarthQuakeAlarmStr_QNAME, String.class, BHandleEarthQuakeAlarm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "monitorUnitCode", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageMonitorUnitCode(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageMonitorUnitCode_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "snowDepthImageStr", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageSnowDepthImageStr(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageSnowDepthImageStr_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "interfaceGateId", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageInterfaceGateId(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageInterfaceGateId_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "lineCode", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageLineCode(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageLineCode_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "bureauCode", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageBureauCode(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageBureauCode_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "clientId", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageClientId(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageClientId_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "monitorPointCode", scope = EUpLoadSnowDepthImage.class)
    public JAXBElement<String> createEUpLoadSnowDepthImageMonitorPointCode(String value) {
        return new JAXBElement<String>(_EUpLoadSnowDepthImageMonitorPointCode_QNAME, String.class, EUpLoadSnowDepthImage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "MonitorUnitBIP", scope = CMDEntity.class)
    public JAXBElement<String> createCMDEntityMonitorUnitBIP(String value) {
        return new JAXBElement<String>(_CMDEntityMonitorUnitBIP_QNAME, String.class, CMDEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "MonitorUnitAIP", scope = CMDEntity.class)
    public JAXBElement<String> createCMDEntityMonitorUnitAIP(String value) {
        return new JAXBElement<String>(_CMDEntityMonitorUnitAIP_QNAME, String.class, CMDEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "G_GetLineCodeResult", scope = GGetLineCodeResponse.class)
    public JAXBElement<String> createGGetLineCodeResponseGGetLineCodeResult(String value) {
        return new JAXBElement<String>(_GGetLineCodeResponseGGetLineCodeResult_QNAME, String.class, GGetLineCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = AHandleWindData.class)
    public JAXBElement<String> createAHandleWindDataNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, AHandleWindData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "windDataStr", scope = AHandleWindData.class)
    public JAXBElement<String> createAHandleWindDataWindDataStr(String value) {
        return new JAXBElement<String>(_AHandleWindDataWindDataStr_QNAME, String.class, AHandleWindData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Speed", scope = DataEntity.class)
    public JAXBElement<String> createDataEntitySpeed(String value) {
        return new JAXBElement<String>(_DataEntitySpeed_QNAME, String.class, DataEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "BureauName", scope = DataEntity.class)
    public JAXBElement<String> createDataEntityBureauName(String value) {
        return new JAXBElement<String>(_DataEntityBureauName_QNAME, String.class, DataEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Level", scope = DataEntity.class)
    public JAXBElement<String> createDataEntityLevel(String value) {
        return new JAXBElement<String>(_DataEntityLevel_QNAME, String.class, DataEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleWindSensorStatus.class)
    public JAXBElement<String> createDHandleWindSensorStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleWindSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "windSensorStatusStr", scope = DHandleWindSensorStatus.class)
    public JAXBElement<String> createDHandleWindSensorStatusWindSensorStatusStr(String value) {
        return new JAXBElement<String>(_DHandleWindSensorStatusWindSensorStatusStr_QNAME, String.class, DHandleWindSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "MonitorPointCode", scope = Entity.class)
    public JAXBElement<String> createEntityMonitorPointCode(String value) {
        return new JAXBElement<String>(_EntityMonitorPointCode_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "LineCode", scope = Entity.class)
    public JAXBElement<String> createEntityLineCode(String value) {
        return new JAXBElement<String>(_EntityLineCode_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "MonitorUnitCode", scope = Entity.class)
    public JAXBElement<String> createEntityMonitorUnitCode(String value) {
        return new JAXBElement<String>(_EntityMonitorUnitCode_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "BureauCode", scope = Entity.class)
    public JAXBElement<String> createEntityBureauCode(String value) {
        return new JAXBElement<String>(_EntityBureauCode_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "LineName", scope = Entity.class)
    public JAXBElement<String> createEntityLineName(String value) {
        return new JAXBElement<String>(_EntityLineName_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "Id", scope = Entity.class)
    public JAXBElement<String> createEntityId(String value) {
        return new JAXBElement<String>(_EntityId_QNAME, String.class, Entity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleEarthQuakeRelayStatus.class)
    public JAXBElement<String> createDHandleEarthQuakeRelayStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleEarthQuakeRelayStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "earthQuakeRelayStatusStr", scope = DHandleEarthQuakeRelayStatus.class)
    public JAXBElement<String> createDHandleEarthQuakeRelayStatusEarthQuakeRelayStatusStr(String value) {
        return new JAXBElement<String>(_DHandleEarthQuakeRelayStatusEarthQuakeRelayStatusStr_QNAME, String.class, DHandleEarthQuakeRelayStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleForeignMatterRelayStatus.class)
    public JAXBElement<String> createDHandleForeignMatterRelayStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleForeignMatterRelayStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "foreignMatterRelayStatusStr", scope = DHandleForeignMatterRelayStatus.class)
    public JAXBElement<String> createDHandleForeignMatterRelayStatusForeignMatterRelayStatusStr(String value) {
        return new JAXBElement<String>(_DHandleForeignMatterRelayStatusForeignMatterRelayStatusStr_QNAME, String.class, DHandleForeignMatterRelayStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = CRemoteCMDControl.class)
    public JAXBElement<String> createCRemoteCMDControlNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, CRemoteCMDControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMDEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "cmdEntiy", scope = CRemoteCMDControl.class)
    public JAXBElement<CMDEntity> createCRemoteCMDControlCmdEntiy(CMDEntity value) {
        return new JAXBElement<CMDEntity>(_CRemoteCMDControlCmdEntiy_QNAME, CMDEntity.class, CRemoteCMDControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = DHandleEarthQuakeSensorStatus.class)
    public JAXBElement<String> createDHandleEarthQuakeSensorStatusNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, DHandleEarthQuakeSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "earthQuakeSensorStatusStr", scope = DHandleEarthQuakeSensorStatus.class)
    public JAXBElement<String> createDHandleEarthQuakeSensorStatusEarthQuakeSensorStatusStr(String value) {
        return new JAXBElement<String>(_DHandleEarthQuakeSensorStatusEarthQuakeSensorStatusStr_QNAME, String.class, DHandleEarthQuakeSensorStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "rainDataStr", scope = GSendSpecifiedRainData.class)
    public JAXBElement<String> createGSendSpecifiedRainDataRainDataStr(String value) {
        return new JAXBElement<String>(_GSendSpecifiedRainDataRainDataStr_QNAME, String.class, GSendSpecifiedRainData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "G_GetBureaCodeResult", scope = GGetBureaCodeResponse.class)
    public JAXBElement<String> createGGetBureaCodeResponseGGetBureaCodeResult(String value) {
        return new JAXBElement<String>(_GGetBureaCodeResponseGGetBureaCodeResult_QNAME, String.class, GGetBureaCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = AHandlSnowData.class)
    public JAXBElement<String> createAHandlSnowDataNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, AHandlSnowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "snowDataStr", scope = AHandlSnowData.class)
    public JAXBElement<String> createAHandlSnowDataSnowDataStr(String value) {
        return new JAXBElement<String>(_AHandlSnowDataSnowDataStr_QNAME, String.class, AHandlSnowData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CoreLib.Entity", name = "AlarmDes", scope = StatusEntity.class)
    public JAXBElement<String> createStatusEntityAlarmDes(String value) {
        return new JAXBElement<String>(_StatusEntityAlarmDes_QNAME, String.class, StatusEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = CCMDControl.class)
    public JAXBElement<String> createCCMDControlNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, CCMDControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "cmdStr", scope = CCMDControl.class)
    public JAXBElement<String> createCCMDControlCmdStr(String value) {
        return new JAXBElement<String>(_CCMDControlCmdStr_QNAME, String.class, CCMDControl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "nodeId", scope = AHandleRainData.class)
    public JAXBElement<String> createAHandleRainDataNodeId(String value) {
        return new JAXBElement<String>(_DHandleRainSensorStatusNodeId_QNAME, String.class, AHandleRainData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http:/DST_V2/AccessBus", name = "rainDataStr", scope = AHandleRainData.class)
    public JAXBElement<String> createAHandleRainDataRainDataStr(String value) {
        return new JAXBElement<String>(_GSendSpecifiedRainDataRainDataStr_QNAME, String.class, AHandleRainData.class, value);
    }

}
