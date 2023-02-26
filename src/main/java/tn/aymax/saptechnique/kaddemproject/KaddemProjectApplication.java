package tn.aymax.saptechnique.kaddemproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class KaddemProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaddemProjectApplication.class, args);
	}

}
