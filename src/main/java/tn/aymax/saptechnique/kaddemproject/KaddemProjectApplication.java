package tn.aymax.saptechnique.kaddemproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAspectJAutoProxy
public class KaddemProjectApplication {

	//@Configuration
	//@ComponentScan("tn.aymax.saptechnique.kaddemproject")
	public static void main(String[] args) {
		SpringApplication.run(KaddemProjectApplication.class, args);
	}

}
