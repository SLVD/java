package com.icss.ch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.icss.ch.util.Util;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Notices;

public class NoticesDao {
	
	List<Notices> list = new ArrayList<Notices>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	Notices not = null;
	
	//查询全部公告
	public List<Notices> selectAllNotices()
	{
		conn = Util.getConnection();
		String sql = "select * from notices";
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				not = new Notices();
				not.setNoticeip(rs.getInt(1));
				not.setNoticeboard(rs.getString(2));
				list.add(not);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	
	}
	
	
	
	//通过noticeip 查询是否存在
	public Notices selectByNoticeip(int noticeip){
		conn = Util.getConnection();
		String sql = "select * from notices where noticeip = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, noticeip);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				not = new Notices();
				not.setNoticeip(rs.getInt(1));
				not.setNoticeboard(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return not;
	}
	

	//增加公告
	public  void insertNotices(Notices not){
		conn = Util.getConnection();
		String sql = "insert into notices values(notseq.nextval,?)";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, not.getNoticeboard());				
			ptmt.executeUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//删除公告
	public void DeleteNotices(int noticeip)
	{
		conn = Util.getConnection();
		String sql = "delete from notices where noticeip = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, noticeip);		
			ptmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
