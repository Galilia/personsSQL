package telran.person.dto;


public class AddressDto {
	String city;
	String street;
	int building;
	
	
	public AddressDto(String city, String street, int building) {
		super();
		this.city = city;
		this.street = street;
		this.building = building;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getBuilding() {
		return building;
	}
	public void setBuilding(int building) {
		this.building = building;
	}
	
	

}
