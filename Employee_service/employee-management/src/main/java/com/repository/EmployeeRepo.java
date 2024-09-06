package repository;

import org.springframework.data.jpa.repository.JpaRepository

import model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

}


