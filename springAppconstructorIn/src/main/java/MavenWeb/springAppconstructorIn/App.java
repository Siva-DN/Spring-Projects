package MavenWeb.springAppconstructorIn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee e1 = (Employee) context.getBean("e1");

		e1.display();

		Employee e2 = (Employee) context.getBean("e2");

		e2.display();

	}
}
