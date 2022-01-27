class Eg
{
	void area()
	{
		int b=6;
		int h=1;
		double res=0.5*b*h;
		System.out.println("Area of triangle is "+res);
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area();
	}	
}