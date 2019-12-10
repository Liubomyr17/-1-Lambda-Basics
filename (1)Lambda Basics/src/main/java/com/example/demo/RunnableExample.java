package com.example.demo;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
            System.out.print("Printed inside Runnable");
            }
        });
        myThread.start();
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
        myLambdaThread.start();
    }

}
