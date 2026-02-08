package com.mycompany.belajar.jawa; //import depending on your file path
import java.util.*;

public class Player {
    private String playerName;
    private int baseHealth = 100, baseAttack = 15, baseDefence = 5;

    private int curAtk, curDef, curHp;

    // atribut iniciate
    public Player(String name) {
        this.playerName = name;
        curAtk = baseAttack;
        curDef = baseDefence;
        curHp = baseHealth;
    }

    // Player.playerReset()
    public void playerReset() {
        curAtk = baseAttack;
        curDef = baseDefence;
        curHp = baseHealth;
    }
    // Player.playerInfo()
    public void playerInfo(){
        
        System.out.printf("\nPlayer: %s\n", playerName);
        System.out.printf("\nattack: %d\n", curAtk);
        System.out.printf("defense: %d\n", curDef);
        System.out.printf("HP: %d\n", curHp);
    }

    public void playerEquip(int h, int a, int d){
        curHp = curHp + h; curAtk = curAtk + a; curDef = curDef + d;
        System.out.printf("\nitem are equiped\n");
    }
}
