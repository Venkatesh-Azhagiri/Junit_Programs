import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest1 {
	private Calculator calc;
	private AdditionInterface add;
@Before
public void initTest()
{
	calc = new Calculator();
	add = EasyMock.createMock(AdditionInterface.class);
	EasyMock.expect(calc.getAddition()).andReturn(add).anyTimes();
	EasyMock.expect(add.add(Integer.class,Integer.class)).andReturn(Integer.class).anyTimes();
	
	
}
@Test
public void addTest()
{
	
}
}
