
// D:\kodonf\github\Belajar-jawa\src\main\java\com\mycompany\belajar\jawa
package com.mycompany.belajar.jawa; //import depending on your file path

import java.util.*;


public class Main {
    /*
     * ==========================
     * objek objek milik main
     * ==========================
     */
    public static final Scanner scanner = new Scanner(System.in);
    public static Menu menu = new Menu();
    public static Weapon shield = new Shield();
    public static Weapon sword = new Sword();

    public static void main(String[] args) {
        String name = menu.getName();
        Player player = new Player(name);

        String choose;
        while (true) {
            menu.menuInterface();
            choose = Main.scanner.nextLine().trim();
            switch (choose) {

                case "1":
                    System.out.println("halo");
                    break;
                case "2":
                    shield.equip(player);
                    break;
                case "3":
                    sword.equip(player);
                    break;
                case "4":
                    player.playerInfo();
                    break;
                default:
                    System.out.printf("\nThank you %s for playing, it was fun", name);
                    break;
            }
        }
    }
}