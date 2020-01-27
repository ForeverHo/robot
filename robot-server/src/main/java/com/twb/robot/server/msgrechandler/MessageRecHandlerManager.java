package com.twb.robot.server.msgrechandler;

import com.twb.robot.server.msgrechandler.imp.LovelyCatGroupInviceMsgRecHandler;
import com.twb.robot.server.msgrechandler.imp.LovelyCatImgMsgRecHandler;
import com.twb.robot.server.msgrechandler.imp.LovelyCatLinkMsgRecHandler;
import com.twb.robot.server.msgrechandler.imp.LovelyCatOtherMsgRecHandler;

public class MessageRecHandlerManager {
	public static 	IMessageReceiveHandler messageReceiveHandler = null ;
	static{
		messageReceiveHandler = new LovelyCatOtherMsgRecHandler(messageReceiveHandler);
		messageReceiveHandler = new LovelyCatImgMsgRecHandler(messageReceiveHandler);
		messageReceiveHandler = new LovelyCatLinkMsgRecHandler(messageReceiveHandler);
		messageReceiveHandler = new LovelyCatGroupInviceMsgRecHandler(messageReceiveHandler);

		

		

	}

	public static IMessageReceiveHandler getMessageReceiveHandler(){
		
		return messageReceiveHandler;
	}
	
}
