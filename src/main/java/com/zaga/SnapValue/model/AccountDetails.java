package com.zaga.SnapValue.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public BigInteger AccountId;

	@Column(name = "UserId")
	public BigInteger UserId;

	@Column(name = "AccountCreatedDate")
	public Date AccountCreatedDate;

	@Column(name = "TotalBalance")
	public int TotalBalance;

	@Column(name = "AccountType")
	public String AccountType;

	@Column(name = "AccountStatus")
	public Boolean AccountStatus;

	@Column(name = "BranchId")
	public BigInteger BranchId;

	public AccountDetails() {
		super();
	}

	public AccountDetails(BigInteger accountId, BigInteger userId, Date accountCreatedDate, int totalBalance,
			String accountType, Boolean accountStatus, BigInteger branchId) {
		super();
		AccountId = accountId;
		UserId = userId;
		AccountCreatedDate = accountCreatedDate;
		TotalBalance = totalBalance;
		AccountType = accountType;
		AccountStatus = accountStatus;
		BranchId = branchId;
	}

	public BigInteger getAccountId() {
		return AccountId;
	}

	public void setAccountId(BigInteger accountId) {
		AccountId = accountId;
	}

	public BigInteger getUserId() {
		return UserId;
	}

	public void setUserId(BigInteger userId) {
		UserId = userId;
	}

	public Date getAccountCreatedDate() {
		return AccountCreatedDate;
	}

	public void setAccountCreatedDate(Date accountCreatedDate) {
		AccountCreatedDate = accountCreatedDate;
	}

	public int getTotalBalance() {
		return TotalBalance;
	}

	public void setTotalBalance(int totalBalance) {
		TotalBalance = totalBalance;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public Boolean getAccountStatus() {
		return AccountStatus;
	}

	public void setAccountStatus(Boolean accountStatus) {
		AccountStatus = accountStatus;
	}

	public BigInteger getBranchId() {
		return BranchId;
	}

	public void setBranchId(BigInteger branchId) {
		BranchId = branchId;
	}

	@Override
	public String toString() {
		return "AccountDetails [AccountId=" + AccountId + ", UserId=" + UserId + ", AccountCreatedDate="
				+ AccountCreatedDate + ", TotalBalance=" + TotalBalance + ", AccountType=" + AccountType
				+ ", AccountStatus=" + AccountStatus + ", BranchId=" + BranchId + "]";
	}

}
