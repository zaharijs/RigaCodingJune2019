/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class ArrayTasks {

    public void masivs() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet masiva garumu: ");

        int size = sc.nextInt();
        int[] numberArray = new int[size];

        double sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Ievadiet masiva" + (i + 1) + ". vertibu");
            numberArray[i] = sc.nextInt();
            sum = sum + numberArray[i];

        }
        System.out.println("Videjais ir " + (sum / numberArray.length));

    }

    public void task2() {
        int a = 5;
        int b = 4;

        System.out.println(a);
        System.out.println(b);
        int c = a; //c=5 , a=5, b=4
        a = b;
        b = c;

        a = a + b;
        b = a - b;
        a = a - b;

    }

    public void masivs2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet masiva garumu: ");

        int size = sc.nextInt();
        int[] numberArray = new int[size];

        double sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Ievadiet masiva" + (i + 1) + ". vertibu");
            numberArray[i] = sc.nextInt();

        }
        int n = numberArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    // swap temp and arr[i]
                    int temp = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(numberArray[i]);
        }
        System.out.println();
    }
public void listExample(){
    
    ArrayList<String> lst = new ArrayList<String>();
    lst.add("Saraksta vertiba");
    lst.add("Vel saraksta vertiba");
    
    for(int i = 0; i<lst.size(); i++){
        System.out.println(lst.get(i));
    }
    for(String value : lst){
        System.out.println(value);
    }
    
    lst.
    
}
}