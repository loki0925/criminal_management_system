package Beans;

import java.util.Date;

public class Crime {

	private int crimeNo;
	private Date crimedate;
	private String place_of_crime;
	private String crimetype;
	private int no_victims;
	private String crime_discription;
	private String suspected_name;
	private boolean case_solved;
	public int getCrimeNo() {
		return crimeNo;		
	}
	public void setCrimeNo(int crimeNo) {
		this.crimeNo = crimeNo;
	}
	public Date getCrimedate() {
		return crimedate;
	}
	public void setCrimedate(Date crimedate) {
		this.crimedate = crimedate;
	}
	public String getPlace_of_crime() {
		return place_of_crime;
	}
	public void setPlace_of_crime(String place_of_crime) {
		this.place_of_crime = place_of_crime;
	}
	public String getCrimetype() {
		return crimetype;
	}
	public void setCrimetype(String crimetype) {
		this.crimetype = crimetype;
	}
	public int getNo_victims() {
		return no_victims;
	}
	public void setNo_victims(int no_victims) {
		this.no_victims = no_victims;
	}
	public String getCrime_discription() {
		return crime_discription;
	}
	public void setCrime_discription(String crime_discription) {
		this.crime_discription = crime_discription;
	}
	public String getSuspected_name() {
		return suspected_name;
	}
	public void setSuspected_name(String suspected_name) {
		this.suspected_name = suspected_name;
	}
	public boolean isCase_solved() {
		return case_solved;
	}
	public void setCase_solved(boolean case_solved) {
		this.case_solved = case_solved;
	}
	@Override
	public String toString() {
		return "Crime [crimeNo=" + crimeNo + ", crimedate=" + crimedate + ", place_of_crime=" + place_of_crime
				+ ", crimetype=" + crimetype + ", no_victims=" + no_victims + ", crime_discription=" + crime_discription
				+ ", suspected_name=" + suspected_name + ", case_solved=" + case_solved + "]";
	}
	public Crime(int crimeNo, Date crimedate, String place_of_crime, String crimetype, int no_victims,
			String crime_discription, String suspected_name, boolean case_solved) {
		super();
		this.crimeNo = crimeNo;
		this.crimedate = crimedate;
		this.place_of_crime = place_of_crime;
		this.crimetype = crimetype;
		this.no_victims = no_victims;
		this.crime_discription = crime_discription;
		this.suspected_name = suspected_name;
		this.case_solved = case_solved;
	}
	public Crime() {
		super();
	}
	
	
	
	
}
