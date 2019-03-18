package com.Lhschools;

public class Main {

    public static void main(String[] args) {

        printAnswer("Messi!");
        printAnswer("Ronaldo!");
        printAnswer("Neymar!");

        printWeather("Lovely.");
        printWeather("Beautiful.");
        printWeather("Miserable.");
    }

    public static void printAnswer(String noun){
        System.out.println("The best soccer player in the world is " +noun);
    }
    public static void printWeather(String noun){
        System.out.println("Hello there, today's weather looks quite " +noun);
    }
}
