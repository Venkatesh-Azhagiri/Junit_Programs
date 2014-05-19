import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setupInformation()
	{
		calculator = new Calculator();
	}
	
	
	@Test
	public void testAdd()
	{
		int c = calculator.add(4,5);
	
		assertEquals(c,8.5,1.5);
		assertEquals(c,9); //if any of the assert fails then test will fail
	}
	
	@Test
	public void testBooleanTrue()
	{
		assertTrue(calculator.booleantrue());
	
		
		
	}
	@Test
	public void testBooleanFalse()
	{
		assertFalse(calculator.booleanfalse());
	}
		
	@Test
	public void testPerson()
	{
		Person p = calculator.getPerson(); 
			/*new Person();
		p.setName("Kannan");
		p.setAge("25");*/
		
		assertSame(p,calculator.getPerson());
		//assertEquals(p,calculator.getPerson());
		
	}
}
