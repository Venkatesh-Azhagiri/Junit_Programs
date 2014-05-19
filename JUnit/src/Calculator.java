
public class Calculator {
	private Person p = new Person();
	public int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c = a-b;
		return c;
	}
	public int multiply(int a,int b)
	{
		int c = a*b;
		return c;
	}
	public int division(int a,int b)
	{
		int c = a/b;
		return c;
	}
	public int modulo(int a,int b)
	{
		int c = a%b;
		return c;
	}
	
	public boolean booleantrue()
	{
		return true;
	}
	
	public boolean booleanfalse()
	{
		return false;
	}
	
	public Person getPerson()
	{ 
		
		p.setName("Kannan");
		p.setAge("25");
		return p;
	}
}
