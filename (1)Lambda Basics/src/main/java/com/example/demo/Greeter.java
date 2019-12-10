package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

@SpringBootApplication
public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        Greeting lambdaGreeting = () -> System.out.print("Hello World");

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.print("Hello World");
            }
        };
        greeter.greet(() -> System.out.print("Hello World"));
        greeter.greet(innerClassGreeting);
    }
}


