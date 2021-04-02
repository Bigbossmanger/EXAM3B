package OOP_Person;


//Subclass Employee
public class Employee {


    private final String title;  //Initialize and store title
    private String name;////Initialize and store employee name
    private String campus;//Initialize and store employee campus
    private String phone;////Initialize and store phone
    private String email;////Initialize and store employee email


    //Employee constructor with parameters
    public Employee(String campus, String phone, String email, String title) {
        this.campus = campus;
        this.phone = phone;
        this.email = email;
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getTitle() {
        return title;
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

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return
                "Name:" + name +
                        " Campus:" + campus +
                        " Phone:" + phone +
                        " Email:" + email +
                        " Title: " + title;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
