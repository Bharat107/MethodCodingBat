package com.Lhschools;

public class Main {

    public static void main(String[] args) {

        printAnswer("Messi");
        printAnswer("Ronaldo");
        printAnswer("Neymar");

        printWeather("Lovely.");
        printWeather("Beautiful.");
        printWeather("Miserable.");

        int a = 3;
        int b = 6;
        System.out.println(a + " times " + b + " is ");
        System.out.println(times(a, b));

        printWorld("World");
        printWorld("Universe");
        printWorld("Galaxy");

        int c = 100;
        int d = 10;
        System.out.println(c + " divided by " + d + " is ");
        System.out.println(Divide(d, c));

        System.out.println(+ d + " goes into " + c + " ten times, the modulus of " + c + " by " + d + " is ");
        System.out.println(Modulus(d, c));
    }

    public static void printAnswer(String noun) {
        System.out.println("Hello " + noun);
    }

    public static void printWeather(String noun) {
        System.out.println("Hello there, today's weather looks quite " + noun);
    }

    public static int times(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static void printWorld(String noun) {
        System.out.println("Hello " + noun);
    }

    public static int Modulus(int firstNumber, int secondNumber) {
        return secondNumber % firstNumber;
    }

    public static int Divide(int firstNumber, int secondNumber) {
        return secondNumber / firstNumber;
    }
}
