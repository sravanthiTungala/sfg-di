package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {
ConstructorInjectController constructorInjectController;
    @BeforeEach
    void setUp() {
        constructorInjectController=new ConstructorInjectController(new PropertyInjectGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectController.getGreeting());
    }
}