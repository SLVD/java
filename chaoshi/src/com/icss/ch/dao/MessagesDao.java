package com.icss.ch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.icss.ch.util.Util;
import com.icss.ch.vo.Messages;


public class MessagesDao {
	
	List<Messages> list = new ArrayList<Messages>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	Messages mes = null;
	
	//��ѯȫ������
	public List<Messages> selectAllMessages()
	{
		conn = Util.getConnection();
		String sql = "select * from messages";
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				mes = new Messages();
				mes.setMessageip(rs.getInt(1));
				mes.setMessageboard(rs.getString(2));
				list.add(mes);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	
	}
	
	
	
	//ͨ��messageip ��ѯ�Ƿ����
	public Messages selectByMessagesip(int messageip){
		conn = Util.getConnection();
		String sql = "select * from messages where messageip = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, messageip);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				mes = new Messages();
				mes.setMessageip(rs.getInt(1));
				mes.setMessageboard(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mes;
	}
	

	//��������
	public  void insertMessages(Messages mes){
		conn = Util.getConnection();
		String sql = "insert into messages values(messeq.nextval,?)";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, mes.getMessageboard());
			ptmt.executeUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//ɾ������
	public void DeleteMessages(int messageip)
	{
		conn = Util.getConnection();
		String sql = "delete from messages where messageip = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, messageip);		
			ptmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
