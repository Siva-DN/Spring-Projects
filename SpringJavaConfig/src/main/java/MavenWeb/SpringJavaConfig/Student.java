package MavenWeb.SpringJavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	
//	@Value("101")
	private int sId;
//	@Value("sree")
	private String sName;
//	@Value("23")
	private int age;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
