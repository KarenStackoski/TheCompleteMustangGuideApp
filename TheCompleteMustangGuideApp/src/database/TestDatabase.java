package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import database.dao.CarDao;
import database.model.CarModel;

public class TestDatabase {
	public static void main(String[] args) throws SQLException{
		Connection connection = ConnectionFactory.getConnection
				("localhost", "3306", "mustang", "root", "admin");
		
		if(connection != null) {
			System.out.println("SUCCESS, YOU'RE CONNECTED!");
			CarDao car = new CarDao(connection);
			ArrayList<CarModel> list = car.selectAll();
			for(CarModel carModel: list) {
				System.out.println(carModel.getId());
			}
		}
		else {
			System.out.println("CONNECTION FAILED!");
		}
	}
}
