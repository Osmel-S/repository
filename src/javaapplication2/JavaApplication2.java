/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaapplication2.entities.Product;
import services.CalculationService;

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
        
        List<Product> list = new ArrayList<>();
        String path = "C://Users//03386346227//Documents//temp";
        
        
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String [] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
         
        
    }
    
}
