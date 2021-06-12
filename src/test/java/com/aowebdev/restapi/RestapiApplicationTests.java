package com.aowebdev.restapi;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aowebdev.restapi.dao.ClientMapper;
import com.aowebdev.restapi.domain.Client;


@SpringBootTest
class RestapiApplicationTests {

    @Autowired
    private ClientMapper clientMapper;
	
    @Test
    public void testClients() {
        List<Client> clients = clientMapper.findAll();
        assertTrue( clients  !=null && clients.size( )> 0);
    }
    
	@Test
	void contextLoads() {
		
	}

}