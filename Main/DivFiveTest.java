package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivFiveTest {

	@Test
	public void divideFive() {
		FooClass junit = new FooClass();
		String result = junit.divisibleFive(15);
		assertEquals("bar",result);
	}
		
}
