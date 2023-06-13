import java.util.Random;
import java.util.Scanner;

class Game {
    public static Random gen = new Random();

    Scanner Userinput = new Scanner(System.in);

    String playername;

    int playerchoice;

    public static void main(String[] argc) {
        Character class1 = new Character(10,2,100);
        Character class2 = new Rogue();
        Character class3 = new Ninja();

        System.out.println("Welcome to the arena what class do you want to be?");
        System.out.println("Type 0 to be a basic warrior");
        System.out.println("Type 1 to be a Rogue");
        System.out.println("Type 2 to be a Ninja");


        System.out.println(class1.name + " vs " + class2.name);
        System.out.println(class1.health + " vs " + class2.health);

        while(class1.isalive() && class2.isalive()) {
            System.out.println(class1.name + ": " + class1.health);
            System.out.println(class2.name + ": " + class2.health);

            int damage;
            damage = class1.attack(class2);
            System.out.println(class1.name + " hits " + class2.name + " for " + damage);

            damage = class2.attack(class1);
            System.out.println(class2.name + " hits " + class1.name + " for " + damage);
        }
            if (class1.isalive()) {
                System.out.println(class1.name + " Wins!");
            }
            else if (class2.isalive()) {
                System.out.println(class2.name + " Wins!");
            }
            else {
                System.out.println("It's a draw!");
            }
        }
    }