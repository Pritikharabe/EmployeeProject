package com.JBK.EmployeeManagmentSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TablePersonalMaster {

	@Id
	int pid;
	String firstname;
	String lastname;
	String birthdate;
	String gender;

	public TablePersonalMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TablePersonalMaster(int pid, String firstname, String lastname, String birthdate, String gender) {
		super();
		this.pid = pid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.gender = gender;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "TablePersonalMaster [pid=" + pid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthdate=" + birthdate + ", gender=" + gender + "]";
	}

}
