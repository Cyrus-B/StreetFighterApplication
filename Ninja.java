import java.util.Random;
import java.util.Scanner;

public class Ninja extends Character {

    public int stealth = 22;

    public Ninja() {
        super();
        this.strength = 7;
        this.defense = 3;
        this.health = 100;
    }


    public int attackn(Character target) {
        boolean criticalHit = Game.gen.nextInt(100) < stealth;
        int damage = this.strength * 3;
        if(criticalHit) {
            damage *= 2;
            System.out.println("*** Critical Hit ***");
        }
        int damagedealt = target.takedamage(damage);
        return damagedealt;
    }
}
