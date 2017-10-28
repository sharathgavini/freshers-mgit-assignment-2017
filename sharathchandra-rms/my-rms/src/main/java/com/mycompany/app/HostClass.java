package com.mycompany.app;

import java.util.HashMap;

public class HostClass {
    private static HashMap<Integer,Boolean> hm;
    static{
        hm = new HashMap<Integer,Boolean>();
        hm.put(1,false);
        hm.put(2,true);
        hm.put(3,false);
        hm.put(4,true);
        //System.out.println("Static block");
    }
    public static HashMap<Integer,Boolean> getMap(){
        return hm;
    }
    
}
