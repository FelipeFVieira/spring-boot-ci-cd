package com.devopscycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorIntegrationTest {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private TestRestTemplate restTemplate; 
	
	@Test
	void shouldReturnCorrectSumHttp() {
		
		String url = "http://localhost:" + port + "/api/soma?a=2&b=3";
		
        ResponseEntity<Integer> response =
                restTemplate.getForEntity(url, Integer.class);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals(5, response.getBody());
	}
}
