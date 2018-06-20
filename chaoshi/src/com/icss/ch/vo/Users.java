package com.icss.ch.vo;

public class Users {
	
	private int userip;
	private int userid;
	private String username;
	private String userpassword;
	private String userstatus;
	private String userphone;
	public Users(int userip, int userid, String username, String userpassword,
			String userstatus, String userphone) {
		super();
		this.userip = userip;
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.userstatus = userstatus;
		this.userphone = userphone;
	}
	public Users() {
		super();
	}
	public int getUserip() {
		return userip;
	}
	public void setUserip(int userip) {
		this.userip = userip;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	@Override
	public String toString() {
		return "Users [userip=" + userip + ", userid=" + userid + ", username="
				+ username + ", userpassword=" + userpassword + ", userstatus="
				+ userstatus + ", userphone=" + userphone + "]";
	}
	public Users(int userid, String username, String userpassword,
			String userstatus, String userphone) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.userstatus = userstatus;
		this.userphone = userphone;
	}
	
	
	

}
