/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Kārlis
 */
public class FileOperations {
    
    private ArrayList inputList;
    
    public FileOperations(){
    inputList = new ArrayList<String>();
    }
    
    public void readSampleFile(){
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Kārlis\\Desktop\\sample.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println("No fail ielasits-" + line);
                inputList.add(line);
                // process the line
            }       } catch (FileNotFoundException ex) {
            System.out.println("Fails nav atrasts!");
        }
    
    }
    
    public ArrayList<String> getFileContent(){
    
        return inputList;
    }
}
