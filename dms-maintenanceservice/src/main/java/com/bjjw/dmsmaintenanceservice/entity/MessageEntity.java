package com.bjjw.dmsmaintenanceservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "MSG_OUTBOX")
public class MessageEntity {
    /***
     * 短信id
     */
    @Id
    @Column(name = "MSGID")
    private int msgId;

    /***
     * 发送级别
     */
    @Column(name = "EXPRESSLEVEL")
    private String expressLevel;


    /***
     * 发送者
     */
    @Column(name = "SENDER")
    private String sender;

    /***
     * 接收者
     */
    @Column(name = "RECEIVER")
    private String receiver;


    /***
     * 消息类型
     */
    @Column(name = "MSGTYPE")
    private String messageType;

    /***
     * 消息内容
     */
    @Column(name = "MSGTITLE")
    private String messageTitle;

    /***
     * 内容路径
     */
    @Column(name = "MMSCONTENTLOCATION")
    private String messageContentLocation;

    /***
     * 内容路径
     */
    @Column(name = "SENDTIME")
    private Date sendTime;

    /***
     * 串口号
     */
    @Column(name = "COMMPORT")
    private int commport;

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getExpressLevel() {
        return expressLevel;
    }

    public void setExpressLevel(String expressLevel) {
        this.expressLevel = expressLevel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContentLocation() {
        return messageContentLocation;
    }

    public void setMessageContentLocation(String messageContentLocation) {
        this.messageContentLocation = messageContentLocation;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public int getCommport() {
        return commport;
    }

    public void setCommport(int commport) {
        this.commport = commport;
    }
}
