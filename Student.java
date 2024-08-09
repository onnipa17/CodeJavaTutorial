public class Student {
    private String name;
    private String email;

    public Student(){
        name = "Unassigned";
        email = "Unassigned";
    }
    public void setName(String StudentName){
        name = StudentName;
    }
    public void setEmail(String address){
        email = address;
    }
    public String getName(){
        return  name;
    }
    public String getEmail(){
        return  email;
    }

}
