import java.util.*;
public class ArrayDemo1 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3; //ตัวแปลค่าคงที่
        int[] hours = new int[EMPLOYEES];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours workec by " + EMPLOYEES+ " employees.");
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.print("Employee " +(index + 1) + " : ");
            hours[index] = in.nextInt();
        }
        System.out.println("The hours you enterred are : ");
        for(int index = 0; index < EMPLOYEES; index++){
            System.out.println(hours[index]);
        }
    }
}
