class Eg
{
	static double area()
	{
		int r=1;
	    final double pi=3.142;
		double res=pi*r*r;
		return res;
	}
}
class Circle
{
	public static void main(String[]args)
	{
		double x=Eg.area();
		System.out.println("Area of circle is "+x);
	}
}