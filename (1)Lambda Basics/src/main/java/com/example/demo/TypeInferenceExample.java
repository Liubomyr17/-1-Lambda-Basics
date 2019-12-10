package com.example.demo;

import java.awt.*;

public class TypeInferenceExample {

    public static void main(String[] args) {
        printLambda(String::length);
    }
    public static void printLambda(StringLengthLambda l) {
        System.out.print(l.getLength("Hello World"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
