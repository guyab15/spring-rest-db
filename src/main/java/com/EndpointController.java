package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saveCustomer")
public class EndpointController {
	 
		@Autowired
		private CustomerRepository repo;
		
	    @PostMapping
	    public ResponseEntity<?> save(@RequestBody Customer customer){
	    	repo.save(customer); 
	        return ResponseEntity.ok("ok. done");
	    }
}
