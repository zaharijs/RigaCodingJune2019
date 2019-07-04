/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Triangle {

    private int a = 0;
    private int b = 0;
    private int c = 0;

    public void setA(int a) {
        
        System.out.println("Enter a: ");
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();

    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        
        System.out.println("Enter B: ");
        Scanner sc = new Scanner(System.in);
        this.b = sc.nextInt();
    }

    public int getB() {
        return b;
    }

    public void setC(int c) {
        
        System.out.println("Enter C: ");
        Scanner sc = new Scanner(System.in);
        this.c = sc.nextInt();
    }

    public int getC() {
        return c;
    }
}
