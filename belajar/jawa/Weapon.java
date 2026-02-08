package com.mycompany.belajar.jawa; //import depending on your file path

import java.util.*;

public interface Weapon {
    int getDef();
    int getAtk();
    int getHp();
    void ench(int buff);
    void equip(Player player);
}

class Shield implements Weapon {

    

    int ench, atk = 2, def = 50 + ench, hp = 10 + ench;
    boolean isEnc = false, isEquip = false;

    @Override
    public int getHp() {
    
        return hp;
    }

    @Override
    public int getAtk() {
        
        return atk;
    }

    @Override
    public int getDef() {
        return def;
    }

    @Override
    public void ench(int buff) {

        if (isEnc) {
            System.out.printf("\nYour shield already enchanted!!\n");
        } else {
            this.ench = buff;
            System.out.printf("\nYour shield is enchanted!!\n");
            isEnc = true;
        }

    }

    @Override
    public void equip(Player player) {
        if (isEquip) {
            System.out.printf("\nYou already equpped this item");
        } else{
            player.playerEquip(hp, atk, def);
            isEquip = true;
        }
    }
}

//sword 

class Sword implements Weapon {
    int ench, atk = 20 + ench, def = 5, hp = 0;
    boolean isEnc = false, isEquip = false;

    @Override
    public int getAtk() {
        return atk;
    }

    @Override
    public int getDef() {
        
        return def;
    }
    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void ench(int buff) {
        if (isEnc) {
            System.out.printf("\nYour sword already enchanted!!\n");
        } else {
            this.ench = buff;
            System.out.printf("\nYour sword is enchanted!!\n");
            isEnc = true;
        }
    }

    @Override
    public void equip(Player player) {
       
        if (isEquip) {
            System.out.printf("\nYou already equpped this item");
        } else{
            player.playerEquip(hp, atk, def);
            isEquip = true;
        }
    }

}
