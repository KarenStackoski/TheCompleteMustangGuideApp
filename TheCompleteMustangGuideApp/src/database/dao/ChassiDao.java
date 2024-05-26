package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.ChassiModel;

public class ChassiDao {
	private String select = "SELECT * FROM mustang.chassi";
	private PreparedStatement pstSelect;
	
	public ChassiDao(Connection connection) throws SQLException{
		pstSelect = connection.prepareStatement(select);
	}
	
	public ArrayList<ChassiModel> selectAll() throws SQLException{
		ArrayList<ChassiModel> chassiList = new ArrayList<ChassiModel>();
		ResultSet result = pstSelect.executeQuery();
		if(result != null) {
			result.first();
			while(result.isAfterLast()) {
				ChassiModel c = new ChassiModel();
				c.setId(result.getInt("id"));
				c.setChassi_description(result.getString("chassi_description"));
				chassiList.add(c);
				result.next();
			}
		}
		return chassiList;
	}
}
