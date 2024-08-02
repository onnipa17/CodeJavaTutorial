public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from  the main method.");
        for(int i = 1; i <= 5; i++){
            displayMassage();
        }
        System.out.println("Back in the main method.");
    }
    public static void displayMassage(){
        System.out.println("Hello from the displayMessage");
    }
}
