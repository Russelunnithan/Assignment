package assignment;

import java.time.LocalDate;
/** 
 * 
 * @author RUSSEL UNNITHAN
 *
 */
// this will create a constructor//
public class person {
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String cityName;
	private String provinceName;
	private String postalCode;
	private LocalDate dateOfBirth;
	
	public person(String first, String last, String street, String city,
			String province, String postal, LocalDate dob)
	{
		 firstName = first;
	     lastName = last;
	     streetAddress = street;
	     cityName = city;
	     provinceName = province;
	     setpostalCode(postal);
	     dateOfBirth = dob;
	     
	}
	//  validating the postalCode that 6 characters were entered or  an IllegalArgumentException should be thrown.//
	private void setpostalCode(String postal){
		int count = postalCode.length();
		if (count >= 6)
			postalCode = postal;
		else
			throw new IllegalArgumentException("The postal code should contains 6 characters");
	}
	
	// get method for each instance variable//
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getCityName() {
		return cityName;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	// get method to return the current age of the person//
	public int getAge()
	{
		LocalDate today = LocalDate.now();
		int birthYear = dateOfBirth.getYear();
		int thisYear = today.getYear();
	    int age = thisYear - birthYear;
	    return age;
	}

	// get method to get the full address of the person/
	public String getFullAddress()
	{
		return streetAddress + "," + cityName + "," + provinceName + "," + postalCode;
	}
	
}

