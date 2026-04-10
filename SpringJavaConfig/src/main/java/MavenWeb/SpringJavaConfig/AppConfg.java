package MavenWeb.SpringJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfg {

	@Bean(name="s1")
	Student getStudent() {
		Student s= new Student();
		
		s.setsName("siva");
		s.setsId(102);
		s.setAge(23);
		
return s;
	}

}
