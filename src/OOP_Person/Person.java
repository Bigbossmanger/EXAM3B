package OOP_Person;

//Super class Person
public class Person {


    private  String email;

   public Person(){

    }

    public Person(String name, String campus, String phone, String email) {
        this();
        this.name = name;
        this.campus = campus;

        this.email=email;
        this.phone = phone;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "Name : " + name  +
                " ,Campus : " + campus  +
                " ,Phone : " + phone +
                " ,Email : " + email ;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setCampus(String campus) {
        this.campus = campus;
    }



    public void setPhone(String phone) {
        this.phone = phone;
    }

    private  String name;// Initialize and store name


    private  String campus;// Initialize and store campus

    private String phone;//Initialize and store phone



    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getCampus() {
        return campus;
    }

    public String getPhone() {
        return phone;
    }
}
