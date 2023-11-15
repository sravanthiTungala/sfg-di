package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class i18NEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-EN";
    }
}
