class Eg
{
	static void area()
	{
	    int a=1;
	    int b=2;
	    final double pi=3.142;
	    double res=pi*a*b;
	    System.out.println("Area of ellipse is "+res);
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		Eg.area();
	}
}