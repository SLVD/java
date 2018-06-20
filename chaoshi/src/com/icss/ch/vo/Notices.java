package com.icss.ch.vo;

public class Notices {
	private int noticeip;
	private String noticeboard;
	public Notices(int noticeip, String noticeboard) {
		super();
		this.noticeip = noticeip;
		this.noticeboard = noticeboard;
	}
	public Notices() {
		super();
	}
	public int getNoticeip() {
		return noticeip;
	}
	public void setNoticeip(int noticeip) {
		this.noticeip = noticeip;
	}
	public String getNoticeboard() {
		return noticeboard;
	}
	public void setNoticeboard(String noticeboard) {
		this.noticeboard = noticeboard;
	}
	@Override
	public String toString() {
		return "Notices [noticeip=" + noticeip + ", noticeboard=" + noticeboard
				+ "]";
	}
	public Notices(String noticeboard) {
		super();
		this.noticeboard = noticeboard;
	}
	
	
	
	

}
