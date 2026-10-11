import java.util.Arrays;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    String name;
    String surname;
    double salary;
    Date birthday;
    String companyName;

    public Employee(String name, String surname, java.util.Date birthday, double salary, String companyName) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.salary = salary;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }
}
