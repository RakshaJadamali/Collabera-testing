class Eg
{
	void area()
	{
		int a=3;
		int b=1;
		int h=2;
		double res=0.5*(a+b)*h;
		System.out.println("Area of trapezoid is "+res);
	}
}
class Trapezoid
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area();
	}	
}