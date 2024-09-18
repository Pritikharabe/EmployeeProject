package com.JBK.EmployeeManagmentSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableEmployeeMaster {

	@Id
	int eid;
	int pid;
	String joinningDate;
	int salary;
	int qid;
	String isfresheremployee;

	public TableEmployeeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableEmployeeMaster(int eid, int pid, String joinningDate, int salary, int qid, String isfresheremployee) {
		super();
		this.eid = eid;
		this.pid = pid;
		this.joinningDate = joinningDate;
		this.salary = salary;
		this.qid = qid;
		this.isfresheremployee = isfresheremployee;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getJoinningDate() {
		return joinningDate;
	}

	public void setJoinningDate(String joinningDate) {
		this.joinningDate = joinningDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getIsfresheremployee() {
		return isfresheremployee;
	}

	public void setIsfresheremployee(String isfresheremployee) {
		this.isfresheremployee = isfresheremployee;
	}

	@Override
	public String toString() {
		return "TableEmployeeMaster [eid=" + eid + ", pid=" + pid + ", joinningDate=" + joinningDate + ", salary="
				+ salary + ", qid=" + qid + ", isfresheremployee=" + isfresheremployee + "]";
	}

}
