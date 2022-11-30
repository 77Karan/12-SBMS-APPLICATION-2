package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ct = SpringApplication.run(Application.class, args);
		int count = ct.getBeanDefinitionCount();
		System.out.println(count);
		String[] names = ct.getBeanDefinitionNames();
		for(String name:names)
		{
			System.out.println(name);
			
		}
	}

}
