package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.model.CarModel;

public class CarDao {
	private String select = "SELECT * FROM mustang.car";
	private PreparedStatement pstSelect;
	
	public CarDao(Connection connection) throws SQLException{
		pstSelect = connection.prepareStatement(select);
	}
	
	public ArrayList<CarModel> selectAll() throws SQLException{
		ArrayList<CarModel> carList = new ArrayList<CarModel>();
		ResultSet result = pstSelect.executeQuery();
		if(result != null) {
			result.first();
			while(result.isAfterLast()) {
				CarModel c = new CarModel();
				c.setId(result.getInt("id"));
				c.setCar_description(result.getString("car_description"));
				c.setChassi_number(result.getString("chassi_number"));
				c.setChassi_id(result.getInt("chassi_id"));
				c.setEngine_id(result.getInt("engine_id"));
				c.setDate_fabrication(result.getDate("date_fabrication"));
				carList.add(c);
				result.next();
			}
		}
		return carList;
	}
}
