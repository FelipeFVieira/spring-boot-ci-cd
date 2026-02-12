package com.devopscycle;

import org.junit.jupiter.api.Test;

import com.devopscycle.controller.CalculatorController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;


public class CalculatorTest {
	
	@Test
	@DisplayName("Given 2 and 5 should return 7")
	void shouldReturnParameterSum() {
		
		CalculatorController controller = new CalculatorController();
		assertEquals(7, controller.soma(2, 5));
		
		
	}
}
