import java.util.Scanner;

public class Switchmenu {

    public static void main(String[] args) {
        //scanner system
        Scanner userinput = new Scanner(System.in);
        //classes
        System.out.println("Choose a class\n1: Warrior\n2: Rogue\n3: Wizard");
        int choice = userinput.nextInt();

        switch(choice) {
            case 1:
                //this is if the user presses 1
                System.out.println("You picked Warrior!");
                break;
            case 2:
                // if 2
                System.out.println("You picked Rogue!");
                break;
            case 3:
                // if 3
                System.out.println("You picked Wizard!");
                break;
            default:
                //if pressed a random number
                System.out.println("Sorry that wasn't an option!");
                break;
        }
    }
}
