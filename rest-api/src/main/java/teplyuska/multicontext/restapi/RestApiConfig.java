package teplyuska.multicontext.restapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("teplyuska.multicontext.restapi.controllers")
@PropertySource("classpath:restapi.application.properties")
@SpringBootApplication(exclude = SpringApplicationAdminJmxAutoConfiguration.class)
public class RestApiConfig {
}
