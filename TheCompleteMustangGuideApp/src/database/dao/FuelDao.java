package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.FuelModel;

public class FuelDao {
	private String select = "SELECT * FROM mustang.fuel";
	private PreparedStatement pstSelect;
	
	public FuelDao(Connection connection) throws SQLException{
		pstSelect = connection.prepareStatement(select);
	}
	
	public ArrayList<FuelModel> selectAll() throws SQLException{
		ArrayList<FuelModel> fuelList = new ArrayList<FuelModel>();
		ResultSet result = pstSelect.executeQuery();
		if(result != null) {
			result.first();
			while(result.isAfterLast()) {
				FuelModel f = new FuelModel();
				f.setId(result.getInt("id"));
				f.setFuel_description(result.getString("chassi_description"));
				fuelList.add(f);
				result.next();
			}
		}
		return fuelList;
	}
}
