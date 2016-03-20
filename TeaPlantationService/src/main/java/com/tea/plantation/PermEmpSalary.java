package com.tea.plantation;

public class PermEmpSalary {

	private long categoryID;
	private long noOfEmp;
	private double workingHrs;
	private long unitAmount;

	public long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}
	public long getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(long noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public double getWorkingHrs() {
		return workingHrs;
	}
	public void setWorkingHrs(double workingHrs) {
		this.workingHrs = workingHrs;
	}
	public long getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(long unitAmount) {
		this.unitAmount = unitAmount;
	}

	@Override
	public String toString() {
		return "Track [categoryID=" + categoryID + ", workingHrs=" + workingHrs + "]";
	}

}
