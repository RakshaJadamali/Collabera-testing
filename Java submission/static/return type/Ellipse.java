class Eg
{
	static double area()
	{
		int a=1;
		int b=2;
	    final double pi=3.142;
		double res=pi*a*b;
		return res;
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
		double x=Eg.area();
		System.out.println("Area of ellipse is "+x);
	}
}