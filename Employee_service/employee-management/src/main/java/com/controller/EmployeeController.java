package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.AutoWired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.repository.EmployeeRepo;
import com.serviceIMPL.EmpolyeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @AutoWired
    private EmpolyeeServiceImpl empservice;

    @GetMapping("/home")
    public String homePage() {

        return "Welcome to Employee Management";
    }

    @PostMapping("/addEmp")
    public ResponseEntity<Employee> addEmpoloyee(@RequestBody Employee employee){

        Employee emp = empservice.addEmpoloyee(employee);

        return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
    }

    @DeleteMapping("/removeEmp")
    public ResponseEntity<String> removeEmployee(@PathVariable int id){

        empservice.removeEmployee(id);

        return new ResponseEntity<String>("Remove Successfully", HttpStatus.ACCEPTED); 

    }

    @GetMapping("/findEmp")
    public ResponseEntity <Optional<Employee>> findEmployeeById(@PathVariable int id){

       Optional<Employee> emps = empservice.findEmpById(id);
       
        return new ResponseEntity<Optional<Employee>>(emps, HttpStatus.ACCEPTED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> ListOfEmployees(){

        List<Employee> lEmp = empservice.getAllEmployee();

        return new ResponseEntity<List<Employee>>(lEmp, HttpStatus.ACCEPTED);
    }
}
