/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;

/**
 *
 * @author 03386346227
 */
public class PrintService {
    ArrayList<Integer> list = new ArrayList();
    public void addValue(int value){
        list.add(value);
    }
    
    public String first(){
        return list.get(0).toString();
    }
}
