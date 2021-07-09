package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you like to walk?");
        String answer = scanner.next();
        if (answer.equals("yes")) {
            System.out.println("Now it is time to run.");
        } else if (answer.equals("no")) {
            System.out.println("It is much more fun to run.");
        } else {
            System.out.println("Please enter yes or no. ");
        }

        person client = new person();

        client.setHeight(1.68);

        client.setGender("female");

        client.setAge(29);
        System.out.println("Person is a " + client.getAge() + " years old " + client.getHeight() + " meters tall " + client.getGender());

        client.setMeals(3);
        System.out.println("Person has " + client.getMeals() + " meals per day");

        client.setComplexion("fair");
        System.out.println();

        client.running();
        client.setSocial("extrovert");
        client.talking();
    }

}
