class Trapezoid
{
	void area()
	{
		int a=1;
		int b=1;
		int h=2;
		double res=0.5*(a+b)*h;
		System.out.println("Area of trapezoid is "+res);
	}
	public static void main(String[]args)
	{
		new Trapezoid().area();
	}
}