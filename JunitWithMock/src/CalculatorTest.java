import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	private Calculator calc;
	private Addition add;
	@Before
	public void initializeTest()
	{
		calc = new Calculator();
		add = new Addition();
		calc.setAddition(add);
	}
	@Test
	public void addition()
	{
		int c = calc.add(4, 5);
		assertEquals(c,9);
	}
	

}

