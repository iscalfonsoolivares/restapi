package com.aowebdev.restapi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aowebdev.restapi.dao.ClientMapper;
import com.aowebdev.restapi.domain.Client;

@SpringBootApplication
@RestController
public class RestapiApplication {
	
	  private final ClientMapper clientMapper;

	  public RestapiApplication(ClientMapper clientMapper) {
	    this.clientMapper = clientMapper;
	  }

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
	
	@GetMapping("/api/v2/clients")
	public List< Client > hello() {				
		return this.clientMapper.findAll() ;
	}

}
