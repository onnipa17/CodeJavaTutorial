import java.util.Scanner;
public class ifAct {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the score : ");
        score = in.nextInt();
        if (score >= 60) {
            System.out.println("You are pass");
        } else {
            System.out.println("You are not pass");
        }
    }
    
}
