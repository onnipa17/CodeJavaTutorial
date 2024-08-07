import java.util.*;
public class Cal_Max {
    public static void main(String[] args) {
        int num1, num2;
        Scanner stdin = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        num1 = stdin.nextInt();
        System.out.print("Input number 2 : ");
        num2 = stdin.nextInt();
        int larger = TestMax.max(num1, num2);
        System.out.println("Max Data is" +larger);
    }
    
}
