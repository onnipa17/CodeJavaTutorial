import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        int num1, num2, num3;
        double average;
        char repeat;
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("This program calculates the average of three number : ");
        do{
            System.out.print("Enter your number #1 : ");
            num1 = in.nextInt();
            System.out.print("Enter your number #2 : ");
            num2 = in.nextInt();
            System.out.print("Enter your number #3 : ");
            num3 = in.nextInt();
            average = (num1 + num2 + num3) / 3.0 ;
            System.out.println("The average is " +average);
            System.out.println();
            System.out.println("Would you like to test again : ");
            System.out.println("Enter Y for yes or N for no :");
            in.nextLine();
            input = in.nextLine();
            repeat = input.charAt(0);
        }while(repeat == 'Y' || repeat == 'y');
    }
}
