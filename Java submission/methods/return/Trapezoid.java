class Trapezoid
{	
	static double area()
	{
		int b=1;
		int a=1;
		int h=2;
		double res=0.5*(a+b)*h;
		return res;
	}
	public static void main(String[]args)
	{
		double q=area();
		System.out.println("Area of trapezoid "+q);
	}
}
		