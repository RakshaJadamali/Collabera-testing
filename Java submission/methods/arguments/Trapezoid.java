class Trapezoid
{
	static void area(int a,int b,int h)
	{
		double res=0.5*(a+b)*h;
		System.out.println("Area of trapezoid is"+res);
	}
	public static void main(String[]args)
	{
		area(1,2,3);
	}
}
