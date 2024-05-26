package database.model;

public class FuelModel {
	private int id;
    private String fuel_description;
    
    public FuelModel() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFuel_description() {
		return fuel_description;
	}
	public void setFuel_description(String fuel_description) {
		this.fuel_description = fuel_description;
	}
    
    
}
