package com.example.demo.generators;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderedIdGenerators implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		String prefix="OD";
		String suffix="";
		
		
		try {
			
			JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
			Connection obtainConnection = jdbcConnectionAccess.obtainConnection();
			
			Statement statement = obtainConnection.createStatement();
			
			String sql="SELECT * FROM order_id_gen";
			
		
			 ResultSet rs = statement.executeQuery(sql);
			 
			 if(rs.next()) {
				 int int1 = rs.getInt(1);
				
				 suffix=String.valueOf(int1);
				 
				 System.out.println(suffix);
				 
				 String updateSql="UPDATE order_id_gen set id=id+1";
				 
				 statement.executeUpdate(updateSql);
			 }
			 
			
		}catch (Exception e) {

		
			e.printStackTrace();
		}
		
		return prefix+suffix;
	}

}
