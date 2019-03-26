package teplyuska.multicontext.app;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import teplyuska.multicontext.integrationapi.IntegrationApiConfig;
import teplyuska.multicontext.restapi.RestApiConfig;

@SpringBootApplication
public class AppApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .parent(RootAppConfig.class).web(WebApplicationType.NONE)
                .child(RestApiConfig.class).web(WebApplicationType.SERVLET)
                .sibling(IntegrationApiConfig.class).web(WebApplicationType.SERVLET)
                .run(args);
    }
}
