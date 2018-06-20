package com.icss.ch.vo;

public class Spinformation {
	
	private int spip;
	private int spid;
	private String spname;
	private String spprice;
	private int kcnum;
	private String manufacyurerid;
	public Spinformation(int spip, int spid, String spname, String spprice,
			int kcnum, String manufacyurerid) {
		super();
		this.spip = spip;
		this.spid = spid;
		this.spname = spname;
		this.spprice = spprice;
		this.kcnum = kcnum;
		this.manufacyurerid = manufacyurerid;
	}
	public Spinformation() {
		super();
	}
	public int getSpip() {
		return spip;
	}
	public void setSpip(int spip) {
		this.spip = spip;
	}
	public int getSpid() {
		return spid;
	}
	public void setSpid(int spid) {
		this.spid = spid;
	}
	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public String getSpprice() {
		return spprice;
	}
	public void setSpprice(String spprice) {
		this.spprice = spprice;
	}
	public int getKcnum() {
		return kcnum;
	}
	public void setKcnum(int kcnum) {
		this.kcnum = kcnum;
	}
	public String getManufacyurerid() {
		return manufacyurerid;
	}
	public void setManufacyurerid(String manufacyurerid) {
		this.manufacyurerid = manufacyurerid;
	}
	@Override
	public String toString() {
		return "Spinformation [spip=" + spip + ", spid=" + spid + ", spname="
				+ spname + ", spprice=" + spprice + ", kcnum=" + kcnum
				+ ", manufacyurerid=" + manufacyurerid + "]";
	}
	public Spinformation(int spid, String spname, String spprice, int kcnum,
			String manufacyurerid) {
		super();
		this.spid = spid;
		this.spname = spname;
		this.spprice = spprice;
		this.kcnum = kcnum;
		this.manufacyurerid = manufacyurerid;
	}
	
	
	


}
