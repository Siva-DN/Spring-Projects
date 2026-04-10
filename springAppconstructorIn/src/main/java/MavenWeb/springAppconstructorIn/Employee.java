package MavenWeb.springAppconstructorIn;

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	
	
	
	void display() {
		System.out.println("*************************");
		System.out.println("empId:"+empId);
		System.out.println("empName:"+empName);
		System.out.println("empSalary:"+empSalary);
	}

	public Employee() {

		System.out.println("no arg constructor called");
	}

	public Employee(int empId, String empName) {
		System.out.println("two arg constructor called");
		this.empId = empId;
		this.empName = empName;

	}

	public Employee(int empId, String empName, double empSalary) {
		System.out.println("three arg constructor called");

		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

}
