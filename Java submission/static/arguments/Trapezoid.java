class Eg
{
	static void area(int a,int b,int h)
	{
		double res=0.5*(a+b)*h;
		System.out.println("Area of trapezoid is "+res);
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		Eg.area(1,2,3);
	}
}