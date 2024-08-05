public class ReturnArray {
    public static double[ ] getArray() {
        double[ ] array = { 1.2, 1.3, 1.4, 1.5, 1.6 };
        return array;
    }
    public static void main(String[] args) {
        double[ ] value;
        value = getArray();
        for(int index = 0; index < value.length; index++){
            System.out.print(value[index]+ " ");
        }
    }
}
