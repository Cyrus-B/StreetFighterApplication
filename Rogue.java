import java.util.Random;
import java.util.Scanner;

public class Rogue extends Character{

    public int dexterity = 24;

    public Rogue() {
        super();
        this.strength = 8;
        this.defense = 4;
        this.health = 100;
    }

    public int attack(Character target) {
        boolean criticalHit = Game.gen.nextInt(100) < dexterity;
        int damage = this.strength * 3;
        if(criticalHit) {
            damage *= 3;
            System.out.println("*** Critical Hit ***");
        }
        int damagedealt = target.takedamage(damage);
        return damagedealt;
    }
}
