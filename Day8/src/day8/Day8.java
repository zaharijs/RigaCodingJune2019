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
public class Day8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileOperations fileIO = new FileOperations();
        fileIO.readSampleFile();
        ArrayList data = fileIO.getFileContent();
        Human humanFromFile = new Human();
        
        for(int i = 0; i<data.size(); i++){
        switch(i){
            case 0:
                humanFromFile.setName((String)data.get(i));
                break;
            case 1:
                humanFromFile.setSurname((String) data.get(i));
                break;
            case 2:
                humanFromFile.setAge(Integer.valueOf((String) data.get(i)));
                break;
            default:
                break;
        }
        
        }
        System.out.println(humanFromFile.getName() + " " + humanFromFile.getSurname() 
                + " " + humanFromFile.getAge());
        //1. Uzstaisam txt failu, 
        //Janis
        //Jurkalns
        //39
        
        //2. Panemam Human klasi no day5
        //3. vertibas pieskiram no faila
        //4. izvadam visu ar getName(), getSurname() un getAge();
   
    
    
        
    
    }
    
}
