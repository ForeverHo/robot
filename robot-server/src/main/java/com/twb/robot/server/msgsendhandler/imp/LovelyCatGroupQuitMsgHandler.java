package com.twb.robot.server.msgsendhandler.imp;

import java.util.HashMap;
import java.util.Map;

import com.twb.robot.bean.SendHandlerContext;
import com.twb.robot.common.config.RobotSendConstants;
import com.twb.robot.config.LovelyCatConstants;
import com.twb.robot.server.msgsendhandler.BaseLovelyCatMsgSendHandler;
import com.twb.robot.server.msgsendhandler.IMessageSendHandler;

public class LovelyCatGroupQuitMsgHandler extends BaseLovelyCatMsgSendHandler{

	public LovelyCatGroupQuitMsgHandler(IMessageSendHandler messageSendHandler) {
		super.wapper = messageSendHandler;
	}




	@Override
	public void handlerMyMessageSend(SendHandlerContext sendHandlerContext) {
		Map map = sendHandlerContext.getSendParam();
		map.put(LovelyCatConstants.MSG_SEND_TYPE, "310");
		map.put(LovelyCatConstants.MSG_SEND_ROBOT_WXID, sendHandlerContext.getMessageSend().getLocalRobotId());
		map.put(LovelyCatConstants.MSG_SEND_GROUP_WXID, sendHandlerContext.getMessageSend().getToGroupId()); 
		
		
	}


	@Override
	public String getCheckMsgType(SendHandlerContext sendHandlerContext) {
		//测试无法退群
		return "err"+RobotSendConstants.MSG_TYPE_GROUPQUIT;
	}



}
