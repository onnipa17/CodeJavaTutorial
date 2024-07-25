public class testNum {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = x+1;
        System.out.println("x = " +x+ " y = " +y);
        y = y++ ;
        System.out.println("x = " +x+ " y = " +y);
        y = ++y ;
        System.out.println("x = " +x+ " y = " +y);
    }
}
