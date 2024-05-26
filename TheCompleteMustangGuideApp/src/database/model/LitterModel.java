package database.model;

public class LitterModel {
	private int id;
    private String litter_description;
    private float litter;
    
    public LitterModel() {
    	
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLitter_description() {
		return litter_description;
	}
	public void setLitter_description(String litter_description) {
		this.litter_description = litter_description;
	}
	public float getLitter() {
		return litter;
	}
	public void setLitter(float litter) {
		this.litter = litter;
	}
    
    
}
