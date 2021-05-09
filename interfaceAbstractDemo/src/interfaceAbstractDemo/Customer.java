package interfaceAbstractDemo;

public class Customer {
int id;
String firstName;
String lastName;
String birthYear;
String nationalId;

public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthYear = dateOfBirth;
	this.nationalId = nationalId;
	
}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getDateOfBirth() {
	return birthYear;
}
public void setDateOfBirth(String dateOfBirth) {
	this.birthYear = dateOfBirth;
}
public String getNationalId() {
	return nationalId;
}
public void setNationalId(String nationalId) {
	this.nationalId = nationalId;
}

}
