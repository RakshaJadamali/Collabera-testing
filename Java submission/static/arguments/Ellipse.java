class Eg
{
	static void area(int a,int b)
	{
	    final double pi=3.142;
		double res=pi*a*b;
		System.out.println("Area of ellipse is "+res);
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		Eg.area(1,2);
	}
}