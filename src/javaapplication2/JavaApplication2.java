/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
import services.PrintService;

/**
 *
 * @author OSMEL SANTOS FEITOSA
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> ps = new PrintService();
        
        System.out.println("how many values?");
        int n = sc.nextInt();
        
        for(int i=0; i<n;i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }
        
        System.out.println("First : " + ps.first());
        
        sc.close();
    }
    
}
