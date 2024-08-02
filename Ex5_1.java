import java.util.Scanner;
public class Ex5_1 {
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

     
        double area = calculateTriangleArea(base, height);

       
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}