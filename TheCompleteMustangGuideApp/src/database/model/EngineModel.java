package database.model;

public class EngineModel {
	private int id;
    private String engine_description;
    private int horse_power;
    private int litter_id;
    private int fuel_id;
    
    public EngineModel() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEngine_description() {
		return engine_description;
	}
	public void setEngine_description(String engine_description) {
		this.engine_description = engine_description;
	}
	public int getHorse_power() {
		return horse_power;
	}
	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}
	public int getLitter_id() {
		return litter_id;
	}
	public void setLitter_id(int litter_id) {
		this.litter_id = litter_id;
	}
	public int getFuel_id() {
		return fuel_id;
	}
	public void setFuel_id(int fuel_id) {
		this.fuel_id = fuel_id;
	}
    
    
}
