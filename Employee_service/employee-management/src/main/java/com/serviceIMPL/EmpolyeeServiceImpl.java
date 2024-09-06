package serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.AutoWired;
import org.springframework.stereotype.service;

import service.EmployeeService;
import model.Employee;
import repository.EmployeeRepo;


@service
public class EmpolyeeServiceImpl implements EmployeeService{

    @AutoWired
    private EmployeeRepo employeeRepo;
    
    @Override
    public Employee addEmpoloyee (Employee employee) {

        Employee emp = employeeRepo.save(employee);

        return emp;
    }

    @Override
    public String removeEmployee (int id) {

        employeeRepo.deleteById(id);

        return "Delete data Successfully";
    }

    @Override
    public Optional<Employee> findEmpById (int id) {

        Optional<Employee> emp = employeeRepo.findEmpById(id);

        if(emp.isPresent()) {
            return emp;
        }else {

            return null;
        }
        
    }

    @Override
    public List<Employee> getAllEmployee () {

        List<Employee> empList = employeeRepo.findAll();

        return empList;

    }

    @Override
    public String updateEmployee (int id) {

        Optional<Employee> emp = employeeRepo.findEmpById(id);

        if(emp.isPresent()) {

            Employee emps = new Employee();

            employeeRepo.save(emps);

            return "Updated Successfully"
        }else {

            return "Employee not found";

        }

    }

}
