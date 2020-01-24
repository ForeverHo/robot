package com.twb.robot.common.entity;

import java.util.Date;

import javax.persistence.*;

//使用JPA注解配置映射关系
@Entity // 告诉JPA这是一个实体类（和数据表映射的类）
@Table(name = "message_receive") // @Table来指定和哪个数据表对应;如果省略默认表名就是user；
public class MessageReceive
{

	public static final String MESSAGETYPE_TEXT = "1";// 1.文本
	public static final String MESSAGETYPE_VOICE = "2";// 2.语音
	public static final String MESSAGETYPE_IMAGE = "3";// 3.图片
	public static final String MESSAGETYPE_LINK = "4";// 4.链接

	@Id // 这是一个主键
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 自增主键
	private Integer id;

	@Column(nullable = false, columnDefinition = "varchar(30)")
	private String msgId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp ; // 消息时间戳

	@Column(columnDefinition = "varchar(200)")
	private String fromUserId =""; // 微信群组发送者id
	@Column(columnDefinition = "varchar(200)")
	private String fromUserName =""; // '微信群组发送者名称'
	
	@Column(columnDefinition = "varchar(200)")
	private String fromGroupId =""; // 微信群组id
	@Column(columnDefinition = "varchar(200)")
	private String wxgroupName =""; // 微信群组名称

	@Column(columnDefinition = "varchar(10)")
	private String msgType  =""; // 消息类型表，1文本，2语音，3图片4链接
	@Column(columnDefinition = "varchar(4000)")
	private String message  =""; // 消息内容,文本，语音转换的文本,链接标题',
	@Column(columnDefinition = "varchar(1000)")
	private String col1="";
	@Column(columnDefinition = "varchar(1000)")
	private String col2="";
	@Column(columnDefinition = "varchar(1000)")
	private String col3="";
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public String getFromGroupId() {
		return fromGroupId;
	}
	public void setFromGroupId(String fromGroupId) {
		this.fromGroupId = fromGroupId;
	}
	public String getWxgroupName() {
		return wxgroupName;
	}
	public void setWxgroupName(String wxgroupName) {
		this.wxgroupName = wxgroupName;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	public String getCol3() {
		return col3;
	}
	public void setCol3(String col3) {
		this.col3 = col3;
	}
	
	
	

}
