import java.util.Scanner;
public class Ex5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        System.out.println(number + (number % 2 == 0 ? " is an even number." : " is an odd number."));

        scanner.close();
    }
}
   

