package com.icss.ch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.icss.ch.util.Util;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Users;

public class MembersDao {

	List<Members> list = new ArrayList<Members>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
    Members mem = null;
	//查询全部会员
	public List<Members> selectAllMembers()
	{
		conn = Util.getConnection();
		String sql = "select * from members";
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				mem = new Members();
				mem.setMemberip(rs.getInt(1));
				mem.setMemberid(rs.getInt(2));
				mem.setCardnum(rs.getString(3));
				mem.setSummoney(rs.getString(4));
				mem.setRegistrationdate(rs.getString(5));
				list.add(mem);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	
	//通过memberid查询会员是否存在
			public Members selectByMemberid(int memberid){
				conn = Util.getConnection();
				String sql = "select * from members where memberid = ?";
				try {
					ptmt = conn.prepareStatement(sql);
					ptmt.setInt(1, memberid);
					rs = ptmt.executeQuery();
					if (rs.next()) {
						mem = new Members();
						mem.setMemberid(rs.getInt(1));
						mem.setCardnum(rs.getString(2));
						mem.setSummoney(rs.getString(3));
						mem.setRegistrationdate(rs.getString(4));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return mem;
			}
	

	
	//增加会员
	public  void insertMembers(Members mem){
		conn = Util.getConnection();
		String sql = "insert into members values(memseq.nextval,?,?,?,?)";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, mem.getMemberid());				
			ptmt.setString(2, mem.getCardnum());
			ptmt.setString(3, mem.getSummoney());
			ptmt.setString(4, mem.getRegistrationdate());
			ptmt.executeUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//删除会员
	public void DeleteMembers(int memberid)
	{
		conn = Util.getConnection();
		String sql = "delete from members where memberid = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, memberid);		
			ptmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		MembersDao dao = new MembersDao();
		Members mem = new Members(5,"5" , "5" ,"5");
		dao.insertMembers(mem);
	}
}
