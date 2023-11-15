package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.PropertyInjectGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {
    PropertyInjectController propertyInjectController;
    @BeforeEach
    void setUP(){
        propertyInjectController = new PropertyInjectController();
        propertyInjectController.greetingService = new PropertyInjectGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(propertyInjectController.getGreeting());
    }
}