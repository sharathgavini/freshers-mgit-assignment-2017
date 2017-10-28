/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import java.io.File;

/**
 *
 * @author shara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("item.txt");
        Names n = new Names();
        System.out.println(n.getFullNames());
        
        System.out.println("Is file exists   : "+f.exists());
    }
    
}
