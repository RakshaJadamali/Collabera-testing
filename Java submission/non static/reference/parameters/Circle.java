class Eg
{
	void area(int r)
	{
		final double pi=3.142;
		double res=pi*r*r;
		System.out.println("Area of circle is "+res);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area(1);
	}	
}