/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import java.util.HashMap;

/**
 *
 * @author shara
 */
public class HashMapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,Boolean> hm = HostClass.getMap();
        System.out.println(hm);
    }
    
}
