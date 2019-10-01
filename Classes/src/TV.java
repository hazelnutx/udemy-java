package Classes.src;

public class TV {
	private String name;
	private String manufacturer;
	
	
	public TV(String name, String manufacturer) {
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	public void startTV() {
		System.out.println("TV Started");
	}
	public String getName() {
		return name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	
	
}
