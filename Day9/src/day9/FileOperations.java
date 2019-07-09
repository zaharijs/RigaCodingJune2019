/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
    public void writeFile(){
    File file = new File("C:\\Users\\Kārlis\\Desktop\\sample3.txt");
    //creates a FileWriter Object
    FileWriter writer;
    try{
//        writer = new FileWriet(file); bez true mes failu parrakstam
       writer = new FileWriter(file, true); //ar true mes liekam tekstu failam beigas
       writer.write("This\n is\n an\n examples3\n");
               writer.flush();
               writer.close();
    }catch(IOException ex){
        System.out.println("Rastit neizdevas!");
    }
       //write the content to the file
    }
}
