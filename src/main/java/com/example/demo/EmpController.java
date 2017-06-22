package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class EmpController {

	  @Autowired  
	    private EmpService empService;   
	 	    
	    @RequestMapping(value="/add-employee", method=RequestMethod.POST, produces="application/json; charset=UTF-8", consumes="application/json")  
	    public EmpRecord addUser(@RequestBody EmpRecord empRecord){  
	        return empService.addEmp(empRecord);  
	    }
	    
	    @RequestMapping(value="/view-employee", method=RequestMethod.POST, produces="application/json; charset=UTF-8")  
	    public List<EmpRecord> getUser(@RequestBody EmpRecord empRecord){  
	        return empService.getUser(empRecord);  
	    } 
	    
	    @RequestMapping(value="/view-allemployee", method=RequestMethod.GET, produces="application/json; charset=UTF-8")  
	    public List<EmpRecord> getAllEmployee() {
			return empService.getAllEmployees();
		}
}
