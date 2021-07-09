package com.company;

import java.util.Scanner;

public class person {


    private double height;
    private int age;
    private int meals;
    private String gender;
    private String complexion;
    private String social;

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMeals() {
        return this.meals;
    }
    public void setMeals(int meals) {
        this.meals = meals;
        if (meals == 0) {
            System.out.println("Person is starving");
        } else {
            return;
        }
    }
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComplexion() {
        return this.complexion;
    }
    public void setComplexion(String complexion) {
        this.complexion = complexion;
        if (complexion.equals("fair")) {
            System.out.println("Remember to use sunscreen");
        } else if (complexion.equals("tan")) {
            System.out.println("Wow, you have  a nice tan!");
        } else if (complexion.equals("medium")) {
            System.out.println("Remember to use moisturizer");
        } else {
            return;
        }

    }
    public String getSocial() {
        return this.social;
    }
    public void setSocial(String social) {
        this.social = social;
    }

    public void talking() {
        if (this.social.equals("extrovert")) {
            System.out.println("Please do not talk too much.");
        } else {
            return;
        }

    }

    public void running() {
        if (this.age <= 9) {
            System.out.println("We suggest you to run 2,5 km.");
            return;
        } else if (this.age <= 11) {
            System.out.println("We suggest you to run 4,5 km.");
            return;
        } else if (this.age <= 14) {
            System.out.println("We suggest you to run 9 km.");
            return;
        } else if (this.age <= 16) {
            System.out.println("We suggest you to run 20 km.");
            return;
        } else if (this.age <= 70) {
            System.out.println("You can run a marathon.");
            return;
        }
    }
}
