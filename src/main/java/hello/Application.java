package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"hello.PersonDao"})
@ComponentScan(basePackageClasses = {hello.GreetingController.class} )
public class Application {

    public static void main(String[] args) {
    	System.out.println("run method");
        SpringApplication.run(Application.class, args);
    
    }

}