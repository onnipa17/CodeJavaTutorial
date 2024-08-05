public class Lengths {
    public static void main(String[] args) {
        int [ ][ ] number = {{ 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 }};
        System.out.println("The number of row is " +number.length);
        for(int index = 0; index < number.length; index++){
            System.out.println("the number of columns in row" + index+ " is " +number[index].length);
        }
    }
}
