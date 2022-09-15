package ru.rsatu.lr1;

public class HelloWorld {
    static String hello = "Hello ";
    public static void printHello(String name) {
        System.out.println(hello+name+"!");
    }

    public void helloDyn(String name) {
        System.out.println("Dynamic hello "+name+"!");
    }
}