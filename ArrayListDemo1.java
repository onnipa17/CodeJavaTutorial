import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList nameList = new ArrayList();
        nameList.add("Ball");
        nameList.add("Java");
        nameList.add("Micro");
        System.out.println("The ArrayList has " +nameList.size()+" Objects stored in it. ");
        for(int index = 0; index < nameList.size(); index++){
            System.out.println(nameList.get(index));
        }
    }
}
