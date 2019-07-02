/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author Kārlis
 */
public class Example {
    private int field1 = 5;
    private int field2 = 6;
    
    public void sample1(){
        int a = 5;
        System.out.println("Sample1 izpilde");
        field2 = 11;
    }
    
    public void sample2(){
        System.out.println(field2);
        sample3();
    }
    
    public int getField1(){
        return field1;
    }
    
    public void setField1(int value){
        if(value>10){
            value = 10;
        }else if(value<0){
            value = 0;
        }
        field1 = value;
    }
    
    private void sample3(){
        System.out.println("So arpuse nelietosim!");
    }
}
