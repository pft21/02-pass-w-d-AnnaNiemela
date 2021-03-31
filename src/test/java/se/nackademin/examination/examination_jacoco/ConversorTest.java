package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testNameConverter() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	@Test
	public void testGenderConverter() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
	}
	
	@Test
	public void testAgeConverter() {
		Conversor conversor = new Conversor();
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
	}
	@Test
	public void testCityConverter() {
		Conversor conversor = new Conversor();
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(10), " a letter that comes after J, ");
	}

}
