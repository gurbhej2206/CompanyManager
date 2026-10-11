import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.Arrays;
import java.util.Comparator;

public class CompanyManagerImpl implements CompanyManager {
    private Map<String, Company> companies = new HashMap<>();

    static Comparator<Employee> CMP_USER_1 = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    @Override
    public void addCompany(String companyName, String description) {
        Company v = new Company(companyName, description);
        companies.put(companyName, v);
    }

    @Override
    public void addEmployee(String name, String surname, java.util.Date birthday, double salary, String companyName) throws MyException {
        Company b = companies.get(companyName);
        if (b == null) {
            // TODO: handle company not found
            return;
        }

        Employee empleado = new Employee(name, surname, birthday, salary, companyName);
        List<Employee> listEmpleados = b.getEmpleados();

        for (int i=0;i<listEmpleados.size();i++) {
            if(listEmpleados.get(i).name == name) {
                return;
            }
        }
        listEmpleados.add(empleado);
    }

    @Override
    public List<Employee> findAllEmployeesOrderedByName() {
        List<Employee> temp = new ArrayList<>();
        for (Company value : companies.values()) {
            for (Employee val : value.getEmpleados()) {
                temp.add(val);
            }
        }
        Arrays.sort(temp, CMP_USER_1);


        List<Employee> b = new ArrayList<>();
        System.out.print("hi");
        return b;
    }

    @Override
    public List<Employee> findAllEmployeesOrderedBySalary() {
        //TODO
    }

    @Override
    public List<Employee> employees(String company) {
        return companies.get(company).getEmpleados();
    }

    @Override
    public List<Company> findAllCompanies() {
        List<Company> temp = new ArrayList<>();
        for (Company value : companies.values()) {
            temp.add(value);
        }
        return temp;
    }
}
