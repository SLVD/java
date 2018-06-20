package com.icss.ch.vo;

public class Members {
	private int memberip;
	private int memberid;
	private String cardnum;
	private String summoney;
	private String registrationdate;
	public Members(int memberip, int memberid, String cardnum, String summoney,
			String registrationdate) {
		super();
		this.memberip = memberip;
		this.memberid = memberid;
		this.cardnum = cardnum;
		this.summoney = summoney;
		this.registrationdate = registrationdate;
	}
	public Members() {
		super();
	}
	public int getMemberip() {
		return memberip;
	}
	public void setMemberip(int memberip) {
		this.memberip = memberip;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getSummoney() {
		return summoney;
	}
	public void setSummoney(String summoney) {
		this.summoney = summoney;
	}
	public String getRegistrationdate() {
		return registrationdate;
	}
	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}
	@Override
	public String toString() {
		return "Members [memberip=" + memberip + ", memberid=" + memberid
				+ ", cardnum=" + cardnum + ", summoney=" + summoney
				+ ", registrationdate=" + registrationdate + "]";
	}
	public Members(int memberid, String cardnum, String summoney,
			String registrationdate) {
		super();
		this.memberid = memberid;
		this.cardnum = cardnum;
		this.summoney = summoney;
		this.registrationdate = registrationdate;
	}
	

}
