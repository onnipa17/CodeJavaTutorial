public class WhileLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("result in forLoop : "+i);
        }
        int iwhile = 1;
        while (iwhile <= 10) {
            System.out.println("result in whileLoop : "+iwhile);
            iwhile += 2;
        }
    }
}
