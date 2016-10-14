package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testCalculateOutPutBasedOnNames1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnNames0() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silvaana");
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testCalculateOutPutBasedOnNames2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silvan");
		assertEquals("The result should be 2", i, 2);
	}
	
	@Test
	public void testCalculateOutPutBasedOnGender0() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testCalculateOutPutBasedOnGender1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnGender2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('O');
		assertEquals("The result should be 2", i, 2);
	}
	
	@Test
	public void testCalculateOutPutBasedOnAge0() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", i, 0);
	}
	
	@Test
	public void testCalculateOutPutBasedOnAge1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(26);
		assertEquals("The result should be 1", i, 1);
	}
	
	@Test
	public void testCalculateOutPutBasedOnHomeCity0(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity1(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity2(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity3(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", i, 3);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity4(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", i, 4);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity5(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", i, 5);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity6(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", i, 6);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity7(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", i, 7);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity8(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i, 8);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity9(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", i, 9);
	}
	@Test
	public void testCalculateOutPutBasedOnHomeCity10(){
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("p");
		assertEquals("The result should be 10", i, 10);
	}
}
