
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculator cc= new Calculator();	
			cc.display();
			System.out.println("Addition "+cc.Add(100, 50));
			cc.Sub();
			int c= cc.Mul(10, 20);
			System.out.println("Multiplication is "+c);
	}
	public void display()
	{
		System.out.println("Calculation result");
	}
	
	public int Add (int a, int b)
	{
		return (a+b);
	}
	public void Sub()
	{
		int a= 100;
		int b=50;
		System.out.println("Sub is "+(a-b));	
	}
	public int Mul(int a, int b)
	{
		return a*b;
	}

}
