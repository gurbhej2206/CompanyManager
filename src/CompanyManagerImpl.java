import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyManagerImpl implements CompanyManager {
    private Map<String, Company> companies = new HashMap<>();

    @Override
    public void addCompany(String companyName, String description) {
        Company v = new Company(companyName, description);
        companies.put(companyName, v);
    }

    @Override
    public void addEmployee(String name, String surname, java.util.Date birthday, double salary, String companyName) throws MyException {
        Employee empleado = new Employee(name, surname, birthday, salary, companyName);
        Company b = companies.get(companyName);
        List<Employee> listEmpleados = b.getEmpleados();

        if (listEmpleados.contains(empleado)) {
            MyException.
        } else {
            listEmpleados.add(empleado);
            b.setEmpleados(listEmpleados);
        }
    }
    @Override
    public List<Employee> findAllEmployeesOrderedByName() {
        //TODO
    }

    @Override
    public List<Employee> findAllEmployeesOrderedBySalary() {
        //TODO
    }

    @Override
    public List<Employee> employees(String company) {
        //TODO
    }

    @Override
    public List<Company> findAllCompanies() {
        //TODO
    }
}
