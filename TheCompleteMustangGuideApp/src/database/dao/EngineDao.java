package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.EngineModel;

public class EngineDao {
	private String select = "SELECT * FROM mustang.engine_car";
	private PreparedStatement pstSelect;
	
	public EngineDao(Connection connection) throws SQLException{
		pstSelect = connection.prepareStatement(select);
	}
	
	public ArrayList<EngineModel> selectAll() throws SQLException{
		ArrayList<EngineModel> engineList = new ArrayList<EngineModel>();
		ResultSet result = pstSelect.executeQuery();
		if(result != null) {
			result.first();
			while(result.isAfterLast()) {
				EngineModel e = new EngineModel();
				e.setId(result.getInt("id"));
				e.setEngine_description(result.getString("engine_description"));
				e.setHorse_power(result.getInt("horse_power"));
				e.setFuel_id(result.getInt("fuel_id"));
				e.setLitter_id(result.getInt("litter_id"));
				engineList.add(e);
				result.next();
			}
		}
		return engineList;
	}
}
