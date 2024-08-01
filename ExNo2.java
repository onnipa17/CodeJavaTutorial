public class ExNo2 {
    public static void main(String[] args) {
        System.out.println("Numbers not exceeding 100 that are divisible by 3 and 5 are : ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
