package com.samra;

public class Medicat extends Feline {
    String girl = "female";
    String boy = "male";

    Feline f = new Feline();

    f.walk();

    Medicat m = new Medicat();

    m.run();

    public static void jump() {
        System.out.println("How high can the female cat jump?");

    }

    public static void stretch() {
        System.out.println("What kind of stretching does your cat do?");

    }
}
