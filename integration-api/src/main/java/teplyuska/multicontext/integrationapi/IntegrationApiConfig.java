package teplyuska.multicontext.integrationapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("teplyuska.multicontext.integrationapi.controllers")
@PropertySource("integrationapi.application.properties")
@SpringBootApplication(exclude = SpringApplicationAdminJmxAutoConfiguration.class)
public class IntegrationApiConfig {
}