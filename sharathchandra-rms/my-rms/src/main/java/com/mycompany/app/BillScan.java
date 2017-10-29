/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author shara
 */
public class BillScan {
    private StringBuilder names;
    private Scanner scan;
    private String amount;
    private Double total;
     BillScan() {
        names = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }

    public StringBuilder Bill() {
        return names;
    }
     private void openFile() {
        try {
            scan = new Scanner(new File("bill.txt"));
            System.out.println("File found!");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    private void readFile() {
        /**
         * Reads the file contents and appends it to the StringBuilder
         */
        try {
            while (scan.hasNextLine()) {
                amount =scan.nextLine();
                total+=Double.parseDouble(amount);
                names.append(amount+"\n");
            }
 
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void closeFile() {
        scan.close();
    }
    
}
