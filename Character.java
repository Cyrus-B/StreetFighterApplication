import java.util.Random;
import java.util.Scanner;

public class Character {
    public String name;
    public int strength;
    public int health;
    public int defense;

    public static String[] nameList = {"George","Michael", "Steve"};

    public Character() {
        this.name = nameList[Game.gen.nextInt(nameList.length)];
    }

    public Character(int str, int def, int health)
    {
        this();
        this.strength = str;
        this.defense = def;
        this.health = health;
    }

    public int takedamage( int damage ) {
        int damagetaken = damage - this.defense;
        this.health -= damagetaken;
        return damagetaken;
    }
    public int attack(Character target) {
        int damage = this.strength * 2;
        int damagedealt = target.takedamage(damage);
        return damagedealt;
    }
    public boolean isalive() {
        return this.health > 0;
    }
}

