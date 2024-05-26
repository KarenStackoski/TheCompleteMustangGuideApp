package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.LitterModel;

public class LitterDao {
	private String select = "SELECT * FROM mustang.chassi";
	private PreparedStatement pstSelect;
	
	public LitterDao(Connection connection) throws SQLException{
		pstSelect = connection.prepareStatement(select);
	}
	
	public ArrayList<LitterModel> selectAll() throws SQLException{
		ArrayList<LitterModel> litterList = new ArrayList<LitterModel>();
		ResultSet result = pstSelect.executeQuery();
		if(result != null) {
			result.first();
			while(result.isAfterLast()) {
				LitterModel l = new LitterModel();
				l.setId(result.getInt("id"));
				l.setLitter_description(result.getString("chassi_description"));
				litterList.add(l);
				result.next();
			}
		}
		return litterList;
	}
}
