public class testdowhile {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <= 10; i++){
            System.out.println("i in for : "+i);
        }
        int iwhile = 1;
        while(iwhile <= 10) {
            System.out.println("iwhile in while : "+iwhile);
            iwhile++;
        }
        int counter = 1;
        do{
            System.out.println("counter in dowhile "+counter);
            counter++;
        }while(counter <= 10);
    }
}
