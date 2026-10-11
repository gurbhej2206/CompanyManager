import java.util.List;
import java.util.ArrayList;

public class Company {
    String companyName;
    String description;
    List<Employee> listEmpleados = new ArrayList<>();

    public Company(String companyName, String description) {
        this.companyName = companyName;
        this.description = description;
    }

    public void setEmpleados(List<Employee> listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    public List<Employee> getEmpleados() {
        return listEmpleados;
    }
}
