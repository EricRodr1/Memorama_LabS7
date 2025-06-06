/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memorama_labs7;
import java.util.ArrayList;
import java.util.Collections;
 
import java.util.Random;

/**
 *
 * @author Eric Rodriguez
 */
public class logica {
     public int[] barajear() {
      
        
        int[] num = new int[16];
        int count = 0;
        
        while(count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 16; i++) {
                if(num[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                num[count] = na;
                count++;
            }
            
        }
        
        
        return num;
    }
}
