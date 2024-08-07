public class Studen {
    private String id;
    private String name;
    private double gpa;
    public void setDetails(String ID, String n, double GPA){
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : " +id);
        System.out.println("Name : " +name);
        System.out.println("GPA : " +gpa);
    }
    public static void main(String[] args) {
        Studen sc1 = new Studen();
        sc1.setDetails("12123", "Onnipa", 3.50);
        sc1.showDetails();
        Studen sc2 = new Studen();
        sc2.setDetails("34123", "Parintya", 3.50);
        sc2.showDetails();
    }
}
