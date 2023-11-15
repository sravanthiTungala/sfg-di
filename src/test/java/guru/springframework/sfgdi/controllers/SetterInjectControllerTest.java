package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {
SetterInjectController setterInjectController;
    @BeforeEach
    void setUp() {
        setterInjectController=new SetterInjectController();
        setterInjectController.setGreetingService(new PropertyInjectGreetingService());
    }

    @Test
    void getGreeting() {
       System.out.println(setterInjectController.getGreeting());
    }
}