package com.icss.ch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.icss.ch.util.Util;
import com.icss.ch.vo.Members;
import com.icss.ch.vo.Spinformation;

public class SpinformationDao {
	
	
	List<Spinformation> list = new ArrayList<Spinformation>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet rs = null;
	Spinformation spin = null;
	//��ѯȫ����Ʒ
	public List<Spinformation> selectAllSpinformation()
	{
		conn = Util.getConnection();
		String sql = "select * from spinformation";
		try {
			ptmt = conn.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()){
				spin = new Spinformation();
				spin.setSpip(rs.getInt(1));
				spin.setSpid(rs.getInt(2));
				spin.setSpname(rs.getString(3));
				spin.setSpprice(rs.getString(4));
				spin.setKcnum(rs.getInt(5));
				spin.setManufacyurerid(rs.getString(6));
				list.add(spin);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	

	//������Ʒȫ����Ϣ
	public  void insertSpinformation(Spinformation spin){
		conn = Util.getConnection();
		String sql = "insert into spinformation values(spiseq.nextval,?,?,?,?,?)";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, spin.getSpid());				
			ptmt.setString(2, spin.getSpname());
			ptmt.setString(3, spin.getSpprice());
			ptmt.setInt(4, spin.getKcnum());
			ptmt.setString(5, spin.getManufacyurerid());
			ptmt.executeUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//��spip  ������Ʒ
			public void UpdateSpinKcnum(int spip)
			{
				conn = Util.getConnection();
				String sql = "update spinformation set kcnum = kcnum-1 where spip = ?";
				try {
					ptmt = conn.prepareStatement(sql);			
					ptmt.setInt(1, spip);		
					ptmt.executeUpdate();
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			//��spip  ����
			public void UpdateSpinAddKcnum(int spip)
			{
				conn = Util.getConnection();
				String sql = "update spinformation set kcnum = kcnum+1 where spip = ?";
				try {
					ptmt = conn.prepareStatement(sql);			
					ptmt.setInt(1, spip);		
					ptmt.executeUpdate();
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			
	//ͨ��spip��ѯ��Ʒ�Ƿ����
	public Spinformation selectBySpip(int spip){
		conn = Util.getConnection();
		String sql = "select * from spinformationDao where spip = ?";
		try {
			ptmt = conn.prepareStatement(sql);
			ptmt.setInt(1, spip);
			rs = ptmt.executeQuery();
			if (rs.next()) {
				spin = new Spinformation();
				spin.setSpip(rs.getInt(1));
				spin.setSpid(rs.getInt(2));
				spin.setSpname(rs.getString(3));
				spin.setSpprice(rs.getString(4));
				spin.setKcnum(rs.getInt(4));
				spin.setManufacyurerid(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return spin;
	}
	
	//ɾ����Ʒ
		public void DeleteSpinformation(int spip)
		{
			conn = Util.getConnection();
			String sql = "delete from spinformation where spip = ?";
			try {
				ptmt = conn.prepareStatement(sql);
				ptmt.setInt(1, spip);		
				ptmt.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
