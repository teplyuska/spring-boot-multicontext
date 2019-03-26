package teplyuska.multicontext.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootAppConfig {
    @Bean
    public String sharedBean() {
        return "Shared Bean";
    }
}
