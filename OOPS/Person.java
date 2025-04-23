package OOPS;

class Person_Class {
    private String firstName;
    private String lastName;

    Person_Class(){
        firstName = "NULL";
        lastName = "NULL";
    }

    Person_Class(String fname,String lname){
        firstName = fname;
        lastName = lname;
    }

    public void setFirstName(String fname){
        firstName = fname;
    }

    public void setLastName(String lname){
        lastName = lname;
    }

    public String toString(){
        return firstName+" "+lastName;
    }


}


public class Person{
    public static void main(String[] args) {
        Person_Class obj = new Person_Class();
        System.out.println("Full Name is: "+obj.toString());
        Person_Class obj2 = new Person_Class("Harsh","Pareek");
        System.out.println("Full name is: "+obj2.toString());
    }
}