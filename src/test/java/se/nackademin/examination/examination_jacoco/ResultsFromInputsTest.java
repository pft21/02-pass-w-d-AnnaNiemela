package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	
	@Test
	public void testNameLengthGettersAndSetters() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForNameLenght(), 1);
	}
	
	@Test
	public void testGenderGettersAndSetters() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(2);
		assertEquals("The result should be 2", resultsFromInputs.getResultForGender(), 2);
	}
	
	@Test
	public void testAgeGettersAndSetters() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(3);
		assertEquals("The result should be 3", resultsFromInputs.getResultForAge(), 3);
	}
	
	@Test
	public void testHomecityGettersAndSetters() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(4);
		assertEquals("The result should be 4", resultsFromInputs.getResultForHomeCity(), 4);
	}

}
