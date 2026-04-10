package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriverClass1 {
	
	public static void main(String[] args) {
		

		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Bike b1=(Bike)context.getBean("b1");
		
		
		System.out.println(b1.getBike_Name());
		System.out.println(b1.getBike_Model());
		System.out.println(b1.getBike_Price());
		System.out.println(b1.getBike_Color());;
	}

}


