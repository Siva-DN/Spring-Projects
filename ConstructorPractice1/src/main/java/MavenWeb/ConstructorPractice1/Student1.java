package MavenWeb.ConstructorPractice1;

public class Student1 {

	private int sId;
	private String sName;
	private int marks;
	private long phone;

	public Student1() {

		System.out.println("no arg constructor called");
	}

	public Student1(int sId, String sName, int marks, long phone) {
		System.out.println("Parameterized constructor called !!");
		this.sId = sId;
		this.sName = sName;
		this.marks = marks;
		this.phone = phone;
	}

	public void show() {
		System.out.println(sId);
		System.out.println(sName);
		System.out.println(marks);
		System.out.println(phone);

	}

}
