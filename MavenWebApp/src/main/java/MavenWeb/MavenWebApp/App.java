package MavenWeb.MavenWebApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Car c1 = (Car) context.getBean("c1");

		System.out.println(c1.getCarModel());
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarPrice());
		
		System.out.println(c1);
		
		Car c2 = (Car) context.getBean("c1");
		System.out.println(c2);

		
	

	}
}
