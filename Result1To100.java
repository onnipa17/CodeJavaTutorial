public class Result1To100 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.println(+i);
        }
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i; 
            i++; 
        }
    System.out.println("sum = "+sum);
    }
}
