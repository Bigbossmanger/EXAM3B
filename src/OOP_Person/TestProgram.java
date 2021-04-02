package OOP_Person;



/**
 * College: Delaware Community College
 *         Course :CSC 164-6C1 (Computer science II)
 *         Assigment :Exam 3b OOP
 *         Author : @Noel Martial Nguemechieu
 *         Due date:04/04/2021
 *         Description: This program demonstrate the concept of encapsulation , inheritance and polymorphism
 */
//Main class
public class TestProgram {

    public static  void  main(String[] args){

// create local variables
        String name ="";
        String campus = "";
        String phone = "";
        String email = "";

        Person p1=new Person(name, campus, phone, email);

        p1.setName("John Doe");//set Name
        p1.setCampus("Dover");//set campus
        p1.setPhone("302-857-5458");//set phone
        p1.setEmail("john.doe@dtcc.edu");//set email

        System.out.println("p1:\n"+p1);//Print person 1 object.

        // create local student variable
        Student s1= new Student( name, campus, phone, email, 1);
        //set student
        s1.setName("John Doe");
        s1.setCampus("Dover");
        s1.setPhone("302-857-5458");
        s1.setEmail("john.doe@dtcc.edu");

        //Print student
        System.out.println("s1:\n"+s1);

      // create local employee variable

        Employee e1=new Employee(campus, phone, email,  "Faculty");

        //Set local employee variables
        e1.setName("John Doe");
        e1.setCampus("Dover");
        e1.setPhone("302-857-5458");
        e1.setEmail("john.doe@dtcc.edu");

        //Print employee
        System.out.println("e1:\n"+e1);

        //Create second student with predefined parameters

        Student s2= new Student("Bill White", "wilmington",
                "232-571-6789","bill.white@dtcc.edu", Student.Junior);

        // Prints Student 2

        System.out.println("s2:\n"+s2);
    }//main method end


}//main class end
