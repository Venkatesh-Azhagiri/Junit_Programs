
public class DoCalculation {
	public static void main(String [] args)
	{
		Calculator calc = new Calculator();
		AdditionInterface addition = new Addition();
		Subtraction sub = new Subtraction();
		calc.setAddition(addition);
		calc.setSubtraction(sub);
		int c=calc.add(4, 5);
		int d=calc.sub(7, 5);
		System.out.println("The addition vlaue is"+c);
		System.out.println("The sub vlaue is"+d);
	}
}
