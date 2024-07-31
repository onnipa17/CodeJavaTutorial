import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.err.println("Enter 1, 2, or 3 :");
        number = keyboard.nextInt();
        switch (number) {
            case 1:
            System.err.println("You enter 1.");
            break;
            case 2:
            System.err.println("You enter 2.");
            break;
            case 3:
            System.err.println("You enter 3.");
            break;
            default:
            System.err.println("that's not 1, 2, or 3!");
            break;
        }
    }
}
