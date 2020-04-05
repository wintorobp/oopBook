
public class Student {
    //data member
    private String name;
    private String email;

    //constructor
    public Student(){
        name = "unassigned";
        email = "unassigned";
    }

    //return the email of this student
    public String getEmail(){
        return email;
    }

    // return the name of this student
    public String getName(){
        return name;
    }

    //assigns the email of this student
    public void setEmail(String address){
        email = address;
    }
    public void setName(String studentName){
        name = studentName;
    }
}