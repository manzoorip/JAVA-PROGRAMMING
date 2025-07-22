package com.ayan.tech.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Question: Find the 10% incremented salary of the employee whose age is greater than 25 years .

public class Employee {

	public static void main(String[] args) {
		
		List<Employee1> emp=new ArrayList<Employee1>();
		emp.add(new Employee1("Manzoor",43,76000.00));
		emp.add(new Employee1("Rahul",23,46000.00));
		emp.add(new Employee1("Komal",33,66000.00));
		emp.add(new Employee1("Alka",21,36000.00));
		emp.add(new Employee1("Mishra",37,86000.00));
		System.out.println("List of Employee Salary before Salary Incremented:" + emp);
		List<Employee1> incrementedvalue=emp.stream().map(x->{
			if(x.getEmpAge()>25)
			{
				x.setSalary(x.getSalary()*1.10);
			}
			return x;
		}).collect(Collectors.toList());
		
		//System.out.println("List of Employee Salary After Incremented:" + incrementedvalue);
		System.out.println("List of Employee Salary After Incremented:");
		incrementedvalue.forEach(System.out::println);
	}
}


class Employee1
{
	
private String empName;
private int empAge;
private double salary;
public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee1(String empName, int empAge, double salary) {
	super();
	this.empName = empName;
	this.empAge = empAge;
	this.salary = salary;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "EmployeeDetails [empName=" + empName + ", empAge=" + empAge + ", salary=" + salary + "]";
}



}