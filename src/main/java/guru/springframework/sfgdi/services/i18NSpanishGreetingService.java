package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class i18NSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Munda- ES";
    }
}
