package database.model;

import java.sql.Date;

public class CarModel {
	private int id;
	private String car_description;
	private Date date_fabrication;
	private int engine_id;
	private String chassi_number;
	private int chassi_id;
	
	public CarModel() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar_description() {
		return car_description;
	}
	public void setCar_description(String car_description) {
		this.car_description = car_description;
	}
	public Date getDate_fabrication() {
		return date_fabrication;
	}
	public void setDate_fabrication(Date date_fabrication) {
		this.date_fabrication = date_fabrication;
	}
	public int getEngine_id() {
		return engine_id;
	}
	public void setEngine_id(int engine_id) {
		this.engine_id = engine_id;
	}
	public String getChassi_number() {
		return chassi_number;
	}
	public void setChassi_number(String chassi_number) {
		this.chassi_number = chassi_number;
	}
	public int getChassi_id() {
		return chassi_id;
	}
	public void setChassi_id(int chassi_id) {
		this.chassi_id = chassi_id;
	}
	
	
}
