package Main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivThreeTest {

	//jUnit Test for divisible by 3
	@Test
	public void divideThree() {
		FooClass junit = new FooClass();
		String result = junit.divisibleThree(3);
		assertEquals("foo",result);
	}
			
}
