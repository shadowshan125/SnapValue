package com.zaga.SnapValue.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public BigInteger BranchId;

	@Column(name = "BranchName")
	public String BranchName;

	@Column(name = "City")
	public String City;

	public Branch() {
		super();
	}

	public Branch(BigInteger branchId, String branchName, String city) {
		super();
		BranchId = branchId;
		BranchName = branchName;
		City = city;
	}

	public BigInteger getBranchId() {
		return BranchId;
	}

	public void setBranchId(BigInteger branchId) {
		BranchId = branchId;
	}

	public String getBranchName() {
		return BranchName;
	}

	public void setBranchName(String branchName) {
		BranchName = branchName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Branch [BranchId=" + BranchId + ", BranchName=" + BranchName + ", City=" + City + "]";
	}

}
