package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	
	DataAnalysis dataAnalysis = new DataAnalysis();
	ArrayList<String> values = new ArrayList<String>();

	@Test
	public void testBuildFinalString() {
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	
	@Test
	public void testGetResultStringNamesAndAge() {
		values.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "28", "Stockholm"));
		assertTrue(dataAnalysis.getResultStringNamesAndAge(values).contains
				("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		assertTrue(dataAnalysis.getResultStringNamesAndAge(values).contains
				("The first name is greater or equals in size to the last name and the participant older than 30"));     
	}
	
	@Test
	public void testGetResultStringHomecityAndAge() {
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		assertTrue(dataAnalysis.getResulStringHomecityAndAge(values).contains
				("The name of the homecity is big and the participant is 30 or older"));
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "29", "Fortaleza"));
		assertTrue(dataAnalysis.getResulStringHomecityAndAge(values).contains
				("The name of the homecity is big and the participant is younger than 30"));
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "28", "Flen"));
		assertTrue(dataAnalysis.getResulStringHomecityAndAge(values).contains
				("The name of the homecity is small and the participant is younger than 30"));
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "31", "Flen"));
		assertTrue(dataAnalysis.getResulStringHomecityAndAge(values).contains
				("The name of the homecity is small and the participant is 30 or older"));
	}

}
