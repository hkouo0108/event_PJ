package org.zerock.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Employee;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8080/api/employees")
public class EmployeeController  {
	
    
	
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/*
	 * @GetMapping("employees") public List<Employee>
	 * fatchEmployees(HttpServletResponse response) {
	 * 
	 * 
	 * List<Employee> employee = new ArrayList<Employee>(); Employee employeeFirst =
	 * new Employee(); employeeFirst.setId("01"); employeeFirst.setName("김이름일");
	 * employeeFirst.setEmail("asdf@gamil.com"); employee.add(employeeFirst);
	 * 
	 * response.setHeader("Access-Control-Allow-Origin", "*");
	 * response.setHeader("Access-Control-Allow-Credentials", "true");
	 * response.setHeader("Access-Control-Allow-Methods",
	 * "GET,HEAD,OPTIONS,POST,PUT");
	 * response.setHeader("Access-Control-Allow-Headers",
	 * "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers"
	 * );
	 * 
	 * 
	 * 
	 * 
	 * 
	 * return employee; }
	 */
	

}
