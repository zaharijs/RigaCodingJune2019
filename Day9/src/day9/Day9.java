/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Kārlis
 */
public class Day9
{
    public static void main(String[] args)
//    throws IOException
    {
//        Scanner textfile = new Scanner(new File("C:\\Users\\Kārlis\\Desktop\\sample2.txt"));
//
//        addstuff(textfile);
//    }   
//
//
//static void addstuff(Scanner aScanner) {
//        int sum = 0;
//
//        while (aScanner.hasNextInt()) {
//            sum += aScanner.nextInt();
//        }
//
//        System.out.println(sum);
FileOperations fileIO = new FileOperations();
fileIO.writeFile();
}



}