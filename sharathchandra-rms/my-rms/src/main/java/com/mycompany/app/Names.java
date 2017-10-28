package com.mycompany.app;

import java.io.File;
import java.util.Scanner;


class Names {

    private Scanner scan;
    private String name;
    private String price;
    private String quantity;
    private StringBuilder fullnames;

    public Names() {
        fullnames = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }

    public StringBuilder getFullNames() {
        return fullnames;
    }

    private void openFile() {
        try {
            scan = new Scanner(new File("item.txt"));
            System.out.println("File found!");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    private void readFile() {
        try {
            while (scan.hasNextLine()) {
                name = scan.nextLine();
                price = scan.nextLine();
                quantity = scan.nextLine();
                fullnames.append(name + " \t" + price + " \t" + quantity + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void closeFile() {
        scan.close();
    }
}
