public class CalOverload {
    public static void main(String[] args) {
        OverloadDemo o1 = new OverloadDemo();
        OverloadDemo o2 = new OverloadDemo(88);
        OverloadDemo o3 = new OverloadDemo(24.7);
        OverloadDemo o4 = new OverloadDemo(2, 4);
        System.out.println("o1.x : " +o1.x); 
        System.out.println("o2.x : " +o2.x);  
        System.out.println("o3.x : " +o3.x);  
        System.out.println("o4.x : " +o4.x);  
    }
}
