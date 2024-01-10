package com.ojas.react.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Employee")
public class EmployeeEntity {
@Id
 public String empid;
 public String employeename;
 public double salary;
 public long mobilenumber;
 public String address;
 public String emaial;
public EmployeeEntity(String empid, String employeename, double salary, long mobilenumber, String address,
		String emaial) {
	super();
	this.empid = empid;
	this.employeename = employeename;
	this.salary = salary;
	this.mobilenumber = mobilenumber;
	this.address = address;
	this.emaial = emaial;
}
public EmployeeEntity() {}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmaial() {
	return emaial;
}
public void setEmaial(String emaial) {
	this.emaial = emaial;
}
@Override
public String toString() {
	return "EmployeeEntity [empid=" + empid + ", employeename=" + employeename + ", salary=" + salary
			+ ", mobilenumber=" + mobilenumber + ", address=" + address + ", emaial=" + emaial + "]";
}
 
 
	
	
}
