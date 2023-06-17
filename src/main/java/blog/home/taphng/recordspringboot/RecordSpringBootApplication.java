package blog.home.taphng.recordspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class RecordSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecordSpringBootApplication.class, args);
	}

}
