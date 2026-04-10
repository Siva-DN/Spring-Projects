package MavenWeb.SpringJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfg.class);
		Student s1 = (Student) context.getBean("s1");
		
		System.out.println(s1.getsId());
		System.out.println(s1.getsName());
		System.out.println(s1.getAge());

	}

}
