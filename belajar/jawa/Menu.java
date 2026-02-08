package com.mycompany.belajar.jawa; //import depending on your file path

import java.util.*; 
// menggunakan Main.Java untuk scanning

public class Menu {

    // yes-no function display
    public void yesNo() {
        System.out.println("1. Yes");
        System.out.printf("2. No\n\n");
    }

    // first interface name display
    public String getName() {
        String choose, name;
        while (true) {
            System.out.printf("\nDear traveler, let me know your name: \n");
            name = Main.scanner.nextLine();

            System.out.printf("\nAre you sure your name will be %s?\n", name);
            yesNo();
            choose = Main.scanner.nextLine();
            if ("1".equals(choose)) {
                return name;
            }
            
        }

    }

    public void menuInterface(){
        System.out.printf("\n=========================\n");
        System.out.printf("\n1. Change name");
        System.out.printf("\n2. Use the shield");
        System.out.printf("\n3. Use the sword");
        System.out.printf("\n4. Get player info");
        System.out.printf("\n5. Exit\n");
        System.out.printf("\n=========================\n");
        System.out.printf("\nChoose: ");
    }

}
