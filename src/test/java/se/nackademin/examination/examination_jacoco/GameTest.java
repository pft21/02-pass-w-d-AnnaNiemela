package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GameTest {
	Game game = new Game();
	
	@Test
	public void testRun() {
		ArrayList<String> arrayOfInputs = new ArrayList<String>();
		arrayOfInputs.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "28", "Stockholm"));
		game.run(arrayOfInputs);
	}
	
	@Test
	public void testGetGenderFromInputValues() {
		ArrayList<String> arrayOfInputs = new ArrayList<String>();
		arrayOfInputs.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "28", "Stockholm"));
		assertEquals(game.getGenderFromInputValues(arrayOfInputs), 'F');
	}
	
	@Test
	public void testGetAgeFromInputValues() {
		ArrayList<String> arrayOfInputs = new ArrayList<String>();
		arrayOfInputs.addAll(Arrays.asList("Game", "Anna", "Niemelä", "F", "28", "Stockholm"));
		assertEquals(game.getAgeFromInputValues(arrayOfInputs), 28);
	}
	
	@Test
	public void testRunGame() {
		game.runGame("Game", "Anna", "Niemelä", 'F', 28, "Stockholm");
	}

	@Test
	public void testCalculateOutBasedOnNames() {
		int i = game.calculateOutPutBasedOnNames("Anna", "Niemelä");
		assertEquals("The result should be 0", i, 0);
		
		int j = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", j, 1);
		
		int k = game.calculateOutPutBasedOnNames("Anna", "Berg");
		assertEquals("The result should be 2", k, 2);
	}
	
	@Test
	public void testCalculateOutBasedOnGender() {
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		
		int j = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", j, 1);
		
		int k = game.calculateOutPutBasedOnGender('U');
		assertEquals("The result should be 2", k, 2);
	}
	
	@Test
	public void testCalculateOutBasedOnAge() {
		int i = game.calculateOutPutBasedOnAge(24);
		assertEquals("The result should be 0", i, 0);
		
		int j = game.calculateOutPutBasedOnAge(26);
		assertEquals("The result should be 1", j, 1);
	}
	
	@Test
	public void testCalculateOutBasedOnHomeCity() {
		int a = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", a, 0);
		int b = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", b, 1);
		int c = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", c, 2);
		int d = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", d, 3);
		int e = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", e, 4);
		int f = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", f, 5);
		int g = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", g, 6);
		int h = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", h, 7);
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i, 8);
		int j = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", j, 9);
		int k = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be 10", k, 10);
	}
}
