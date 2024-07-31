import java.util.Scanner;
public class MinOfThree {
    public static void main(String[] args) {
        int num1, num2, num3, min = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your three integer:");
        num1 = in.nextInt();
        num2 = in.nextInt();        
        num3 = in.nextInt();
        if(num1 < num2){
            if(num1 < num3){
                min = num1;
            }else{
                if(num2 < num3){
                    min = num2;
                }else{
                    min = num3;
                }    
            }
            System.out.println("Mininum value: "+min);
        } 
    }
}
