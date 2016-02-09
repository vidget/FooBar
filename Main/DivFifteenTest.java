package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivFifteenTest {

	@Test
	public void divideFifteen() {
		FooClass junit = new FooClass();
		String result = junit.divisibleFifteen(30);
		assertEquals("foobar",result);
	}
	
}
