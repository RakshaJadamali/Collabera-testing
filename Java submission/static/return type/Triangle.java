class Eg
{
	static double area()
	{
		int b=1;
		int h=2;
		double res=0.5*b*h;
		return res;
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		double x=Eg.area();
		System.out.println("Area of triangle is "+x);
	}
}