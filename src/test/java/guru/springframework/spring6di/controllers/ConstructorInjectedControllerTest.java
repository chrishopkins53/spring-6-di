package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {
@Autowired
    ConstructorInjectedController constructorInjectedController;
    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}