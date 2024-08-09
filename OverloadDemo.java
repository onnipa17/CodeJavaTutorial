public class OverloadDemo {
    int x;
    OverloadDemo(){
        System.out.println("Insedde OverloadDemo(). ");    
        x = 0;
    }
    OverloadDemo(int i){
        System.out.println("Insedde OverloadDemo(int). ");
        x = 1;
    }
    OverloadDemo(double d){
        System.out.println("Insedde OverloadDemo(double).");
        x = (int)d;
    }
    OverloadDemo(int i, int j){
        System.out.println("Insedde OverloadDemo(int, int).");
        x = i * j;
    }
}
