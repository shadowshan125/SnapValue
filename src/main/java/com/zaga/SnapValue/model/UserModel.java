package com.zaga.SnapValue.model;

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
	public long UserId;
	@Column(name = "UserName")
	public String UserName;
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

	public UserModel(long userId, String userName, int userAge, String city, String branch, int phone, String email,
			Date dateOfBirth) {
		super();
		UserId = userId;
		UserName = userName;
		UserAge = userAge;
		City = city;
		Branch = branch;
		Phone = phone;
		Email = email;
		DateOfBirth = dateOfBirth;
	}

	public long getUserId() {
		return UserId;
	}

	public void setUserId(long userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
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
		return "UserModel [UserId=" + UserId + ", UserName=" + UserName + ", UserAge=" + UserAge + ", City=" + City
				+ ", Branch=" + Branch + ", Phone=" + Phone + ", Email=" + Email + ", DateOfBirth=" + DateOfBirth + "]";
	}

}
