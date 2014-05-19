
public class Calculator {
	private AdditionInterface addition;
	private Subtraction subtraction;
	
	public int add(int a,int b)
	{
		int c=0;
		c=getAddition().add(a,b);
		return c;
		
	}
	public int sub(int a, int b)
	{
		int c=0;
		c=getSubtraction().sub(a,b); 
		return c;
	}
	public AdditionInterface getAddition() {
		return addition;
	}
	public void setAddition(AdditionInterface addition) {
		this.addition = addition;
	}
	public Subtraction getSubtraction() {
		return subtraction;
	}
	public void setSubtraction(Subtraction subtraction) {
		this.subtraction = subtraction;
	}
	
}
