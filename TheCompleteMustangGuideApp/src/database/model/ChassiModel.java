package database.model;

public class ChassiModel {
	private int id;
    private String chassi_description;
    
    public ChassiModel() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChassi_description() {
		return chassi_description;
	}
	public void setChassi_description(String chassi_description) {
		this.chassi_description = chassi_description;
	}
    
    
}
