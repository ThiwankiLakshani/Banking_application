package service;

import List;

import model.Employee;

public interface EmployeeService {

    public Employee addEmpoloyee(Employee employee);

    public String removeEmployee(int id);

    public Optional<Employee> findEmpById(int id);

    public List<Employee> getAllEmployee();

    public String updateEmployee(int id);




}
