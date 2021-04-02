package OOP_Person;//package

enum gradeLevel {//a simple enumeration to store standings
    Freshman, Sophomore, Junior, Senior
}
// subclass Student
public class Student {

    protected static final int Freshman = 0;
    protected static final int Sophomore=1;
    protected static final int Junior=3;
    protected static final int Senior=4;

    private final gradeLevel standings; //see the enum at the bottom
    private String name;//// initialise and store name
    private String campus;// initialise and store campus
    private String phone;// initialise and store phone
    private String email;// initialise and store email


    //Student Constructor with parameters
    public Student(String name, String campus, String phone, String email, int Class) {
        this.name = name;
        this.campus = campus;
        this.phone = phone;
        this.email = email;
        this.standings = gradeLevel.values()[Class - 1];

    }


    public void setName(String name) {
        this.name = name;
    }//set  student name


    public void setCampus(String campus) {
        this.campus = campus;
    }//set campus

    public void setPhone(String phone) {
        this.phone = phone;
    }//set phone

    public void setEmail(String email) {
        this.email = email;
    }//Set email


    @Override
    public String toString() {//toString Method to print student
        return
                "Name : " + name +
                        ", Campus :" + campus +
                        ", Phone :" + phone +
                        ", Email :" + email +
                        ", Class :" + standings;
    }

}
