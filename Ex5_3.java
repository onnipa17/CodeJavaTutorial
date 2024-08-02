import java.util.Scanner;
public class Ex5_3 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

       
        System.out.println("The maximum value is: " + Math.max(number1, number2));

        scanner.close();
    }
}


