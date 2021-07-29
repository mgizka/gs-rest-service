package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.net.URISyntaxException;

@RestController
public class CpeInfoController {

	@GetMapping("/cpeinfo/{sn}")
	public CpeInfo cpeinfo(@PathVariable String sn) {

		String query = "SELECT * FROM \"CPE\" WHERE cpesn='"+sn+"'";
		CpeInfo cp = null;
		
		try (Connection con = DbUtil.getConnection()){

			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()){
					cp = new CpeInfo(
						rs.getString("cpesn"),
						rs.getString("cpemodel"),
						rs.getString("cpeversion"),
						rs.getString("cpestatus"),
						rs.getString("cpetype")
					);
					break;
			}
		}catch(URISyntaxException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return cp;
	}
}
