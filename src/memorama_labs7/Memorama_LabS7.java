/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memorama_labs7;

import java.util.Random;

/**
 *
 * @author Eric Rodriguez
 */
public class Memorama_LabS7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
        //Barajear cartas
        int[] numbers = new int[16];
        int count = 0;
        
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 16; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }
            
    }
        for (int i = 0; i < 16; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
    }
    
