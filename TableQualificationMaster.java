package com.JBK.EmployeeManagmentSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TableQualificationMaster {

	@Id
	int qid;
	String qualification;

	public TableQualificationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableQualificationMaster(int qid, String qualification) {
		super();
		this.qid = qid;
		this.qualification = qualification;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "TableQualificationMaster [qid=" + qid + ", qualification=" + qualification + "]";
	}

}
