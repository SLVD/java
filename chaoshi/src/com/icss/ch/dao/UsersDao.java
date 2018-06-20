package com.icss.ch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.icss.ch.util.Util;
import com.icss.ch.vo.Users;

public class UsersDao {
	
	List<Users> list = new ArrayList<Users>();	
	List<Users> userlist = new ArrayList<Users>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	Users use = null;
	
	
	//�����ݿ�����ȡ����
		//JDBC  5
		public Users selectBynamepass(String username,String password){
			conn = Util.getConnection();
			String sql = "select * from users where username = ? and userpassword = ?";
			try {
				ptmt = conn.prepareStatement(sql);
				ptmt.setString(1, username);
				ptmt.setString(2, password);
				rs = ptmt.executeQuery();
				if (rs.next()) {
					use = new Users();
					use.setUserip(rs.getInt(1));
					use.setUserid(rs.getInt(2));
					use.setUsername(rs.getString(3));
					use.setUserpassword(rs.getString(4));
					use.setUserstatus(rs.getString(5));
					use.setUserphone(rs.getString(6));
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return use;
		}
		
		//ͨ���û�����ѯ�Ƿ����
		public Users selectByname(String username){
			conn = Util.getConnection();
			String sql = "select * from users where username = ?";
			try {
				ptmt = conn.prepareStatement(sql);
				ptmt.setString(1, username);
				rs = ptmt.executeQuery();
				if (rs.next()) {
					use = new Users();
					use.setUserip(rs.getInt(1));
					use.setUserid(rs.getInt(2));
					use.setUsername(rs.getString(3));
					use.setUserpassword(rs.getString(4));
					use.setUserstatus(rs.getString(5));
					use.setUserphone(rs.getString(6));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return use;
		}
		
		
		//��ѯ����ͨ��ע���Ա��
		public List<Users> selectAllUser()
		{
			conn = Util.getConnection();
			String sql = "select * from Users where userstatus = 1 ";
			try {
				ptmt = conn.prepareStatement(sql);
				rs = ptmt.executeQuery();
				while(rs.next()){
					use = new Users();
					use.setUserip(rs.getInt(1));
					use.setUserid(rs.getInt(2));
					use.setUsername(rs.getString(3));
					use.setUserpassword(rs.getString(4));
					use.setUserstatus(rs.getString(5));
					use.setUserphone(rs.getString(6));
					list.add(use);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
			
			
		}
		
		
		//��ѯ״ֵ̬��2��Ա��
		public List<Users> selectByUserstatus(){
			conn = Util.getConnection();
			String sql = "select * from users where userstatus = 2 ";
			try
			{
				ptmt = conn.prepareStatement(sql);
				rs = ptmt.executeQuery();
				while (rs.next()) 
				{
					use = new Users();
					use.setUserip(rs.getInt(1));
					use.setUserid(rs.getInt(2));
					use.setUsername(rs.getString(3));
					use.setUserpassword(rs.getString(4));
					use.setUserstatus(rs.getString(5));
					use.setUserphone(rs.getString(6));
					list.add(use);
				}
				 
			
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			return list;
		}
		
		
		//Ա��ע��
		public  void insertUsers(Users use){
			conn = Util.getConnection();
			String sql = "insert into users values(useseq.nextval,?,?,?,?,?)";
			try {
				ptmt = conn.prepareStatement(sql);
				ptmt.setInt(1, use.getUserid());			
				ptmt.setString(2, use.getUsername());
				ptmt.setString(3, use.getUserpassword());
				ptmt.setString(4, use.getUserstatus());
				ptmt.setString(5, use.getUserphone());
				ptmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		

		//ɾ��Ա��
		public void DeleteUser(int userip)
		{
			conn = Util.getConnection();
			String sql = "delete from users where userip = ?";
			try {
				ptmt = conn.prepareStatement(sql);
				ptmt.setInt(1, userip);		
				ptmt.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		

		//�޸���ע��Ա����״ֵ̬
		public void UpdateUserStatus(int userip)
		{
			conn = Util.getConnection();
			String sql = "update users set userstatus = 1 where userip = ?";
			try {
				ptmt = conn.prepareStatement(sql);			
				ptmt.setInt(1, userip);		
				ptmt.executeUpdate();
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		//�޸�����
				public void UpdateUserpwd(String userpassword , int userip)
				{
					int num=0;
					conn = Util.getConnection();
					String sql = "update users set userpassword = ? where userip = ?";
					try {
						ptmt = conn.prepareStatement(sql);			
						ptmt.setString(1, userpassword);	
						ptmt.setInt(2, userip);	
						ptmt.executeUpdate();
					
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}

		
		public static void main(String[] args) {
			
			UsersDao dao = new UsersDao();
			List<Users> userlist = dao.selectAllUser();
			for (Users users : userlist) {
				System.out.println(users);
			}
		}

}
