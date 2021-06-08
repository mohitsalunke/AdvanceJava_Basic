package JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigDemo {

	@Bean
	public Department getDepartment()
	{
		return new Department();
	}
	
	@Bean
	public Employee getEmp()
	{
		return new Employee();
	}
	
}
