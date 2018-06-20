package com.icss.ch.vo;

public class Messages {
	private int messageip;
	private String messageboard;
	public Messages(int messageip, String messageboard) {
		super();
		this.messageip = messageip;
		this.messageboard = messageboard;
	}
	public Messages() {
		super();
	}
	public int getMessageip() {
		return messageip;
	}
	public void setMessageip(int messageip) {
		this.messageip = messageip;
	}
	public String getMessageboard() {
		return messageboard;
	}
	public void setMessageboard(String messageboard) {
		this.messageboard = messageboard;
	}
	@Override
	public String toString() {
		return "messages [messageip=" + messageip + ", messageboard="
				+ messageboard + "]";
	}
	public Messages(String messageboard) {
		super();
		this.messageboard = messageboard;
	}
	

}
