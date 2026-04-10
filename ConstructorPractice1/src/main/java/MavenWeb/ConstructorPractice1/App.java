package MavenWeb.ConstructorPractice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        
        Student1 s1=(Student1)context.getBean("s1");
        
        s1.show();
        
        
        
        
    }
}
