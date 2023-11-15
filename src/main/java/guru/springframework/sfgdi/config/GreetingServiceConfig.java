package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile("ES")
    @Bean("i18NService")
    public i18NSpanishGreetingService i18NSpanishGreetingService(){
        return new i18NSpanishGreetingService();
    }
    @Profile("EN")
    @Bean("i18NService")
    public i18NEnglishGreetingService i18NEnglishGreetingService(){
        return new i18NEnglishGreetingService();
    }
    @Primary
    @Bean
    public PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    public PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    public SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

    @Bean
    public ConstructorInjectGreetingService constructorInjectGreetingService(){
        return new ConstructorInjectGreetingService();
    }
}
