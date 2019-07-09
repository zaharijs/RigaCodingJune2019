/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.util.Scanner;

/**
 *
 * @author Marti
 */
public class Human {

    //1. Sataisit parbaudi set metodem
    //2. Uztaisit metodi, kas liek lietotajam ievadit pasreizejo gadu
    //(int) gada-vecumu izvadit, kura gada cilveks ir piedzimis
    private String name = "";
    private String surname = "";
    private int age = 0;

    public void setName(String name) {

        if (name.equals("")) {
            System.out.println("Ievadiet vardu!");
            Scanner sc = new Scanner(System.in);
            name = sc.next();
        }

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                this.name = "Ievades kluda";
            }
        }
        if (Character.isLowerCase(name.charAt(0))) {
//            name.charAt(0) = Character.toUpperCase(name.charAt(0));
            //TODO atrast uz Upper case

            System.out.println(name);
        }

        this.name = name;
    }

    public void printYearOfBirth() {
        System.out.println("Ievadiet pasreizejo gadu!");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("Jusu dzimsanas gads ir " + (year - this.age));
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public String getName() {
        if (this.name.equals("")) {
            System.out.println("Ievadiet vardu!");
            Scanner sc = new Scanner(System.in);
            this.name = sc.next();
        }
        return name;
    }

    public String getSurname() {
        if (this.name.equals("")) {
            return "NavDatu!!";
        }
        return surname;
    }

    public int getAge() {
        return age;
    }

}
