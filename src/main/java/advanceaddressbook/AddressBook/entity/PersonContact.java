package advanceaddressbook.AddressBook.entity;

import java.util.Objects;

public class PersonContact {
	
	String fname;
	String lname;
	String address;
	String city;
	String state;
	String zipcode;
	String phone;
	String email;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonContact [fname : " + fname + ", lname : " + lname + ", address : " + address + ", city : " + city
				+ ", state : " + state + ", zipcode : " + zipcode + ", phone : " + phone + ", email : " + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonContact other = (PersonContact) obj;
		return Objects.equals(fname, other.fname);
	}
	
	
}
