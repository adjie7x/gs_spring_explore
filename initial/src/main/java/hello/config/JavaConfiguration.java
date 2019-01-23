package hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("customJavaConfiguration")
public class JavaConfiguration {
	
	@Bean
	public String someDummyBeans1(){
		return "someDummyBeans1";
	}
	
	@Bean
	public String someDummyBeans2(){
		return "someDummyBeans2";
	}

}
