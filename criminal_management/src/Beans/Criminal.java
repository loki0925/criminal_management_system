package Beans;

public class Criminal {

	private int criminalId;
	private String criminal_name;
	private int age;
	private String gender;
	private String address;
	private String area_of_crime;
	private String Criminal_crime_type;
	public Criminal(int criminalId, String criminal_name, int age, String gender, String address, String area_of_crime,
			String criminal_crime_type) {
		super();
		this.criminalId = criminalId;
		this.criminal_name = criminal_name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.area_of_crime = area_of_crime;
		Criminal_crime_type = criminal_crime_type;
	}
	public int getCriminalId() {
		return criminalId;
	}
	public void setCriminalId(int criminalId) {
		this.criminalId = criminalId;
	}
	public String getCriminal_name() {
		return criminal_name;
	}
	public void setCriminal_name(String criminal_name) {
		this.criminal_name = criminal_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea_of_crime() {
		return area_of_crime;
	}
	public void setArea_of_crime(String area_of_crime) {
		this.area_of_crime = area_of_crime;
	}
	public String getCriminal_crime_type() {
		return Criminal_crime_type;
	}
	public void setCriminal_crime_type(String criminal_crime_type) {
		Criminal_crime_type = criminal_crime_type;
	}
	@Override
	public String toString() {
		return "Criminal [criminalId=" + criminalId + ", criminal_name=" + criminal_name + ", age=" + age + ", gender="
				+ gender + ", address=" + address + ", area_of_crime=" + area_of_crime + ", Criminal_crime_type="
				+ Criminal_crime_type + "]";
	}
	public Criminal() {
		super();
	}
	
	
}

