import java.util.Date;

public class Employee {
    String name;
    String surname;
    Double salary;
    Date birthday;
    String companyName;

    public Employee(String name, String surname, java.util.Date birthday, double salary, String companyName) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.companyName = companyName;
    }
}
