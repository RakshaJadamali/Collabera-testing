class Eg
{
	static void area(int b,int h)
	{
		double res=0.5*b*h;
		System.out.println("Area of triangle is "+res);
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		Eg.area(1,2);
	}
}