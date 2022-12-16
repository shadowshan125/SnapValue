package com.zaga.SnapValue.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public BigInteger UserId;
	@Column(name = "FirstName")
	public String FirstName;
	@Column(name = "LastName")
	public String LastName;
	@Column(name = "UserAge")
	public int UserAge;
	@Column(name = "City")
	public String City;
	@Column(name = "Branch")
	public String Branch;
	@Column(name = "Phone")
	public int Phone;
	@Column(name = "Email")
	public String Email;
	@Column(name = "DateOfBirth")
	public Date DateOfBirth;

	public UserModel() {
		super();
	}

	public UserModel(BigInteger userId, String firstName, String lastName, int userAge, String city, String branch,
			int phone, String email, Date dateOfBirth) {
		super();
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		UserAge = userAge;
		City = city;
		Branch = branch;
		Phone = phone;
		Email = email;
		DateOfBirth = dateOfBirth;
	}

	public BigInteger getUserId() {
		return UserId;
	}

	public void setUserId(BigInteger userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getUserAge() {
		return UserAge;
	}

	public void setUserAge(int userAge) {
		UserAge = userAge;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "UserModel [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", UserAge="
				+ UserAge + ", City=" + City + ", Branch=" + Branch + ", Phone=" + Phone + ", Email=" + Email
				+ ", DateOfBirth=" + DateOfBirth + "]";
	}

}
