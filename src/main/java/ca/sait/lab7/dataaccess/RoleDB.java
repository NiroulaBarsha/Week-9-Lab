/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.lab7.dataaccess;
import ca.sait.lab7.models.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.sql.*;
/**
 *
 * @author dbrai
 */
public class RoleDB {
    public List<Role> getAll() throws Exception{
		List<Role> roles = new ArrayList<>();
		ConnectionPool cp=ConnectionPool.getInstance();
		Connection con= cp.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		String sql="SELECT * FROM role";
		try{
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
			Long id=rs.getLong(1);
			String name=rs.getString(2);
			
			Role role=new Role(id,name);	
			roles.add(role);
			
			}
			
			
		}finally{
			DBUtil.close(rs);
			DBUtil.close(ps);
			cp.freeConnection(con);
		}
		return roles;

	}
}
