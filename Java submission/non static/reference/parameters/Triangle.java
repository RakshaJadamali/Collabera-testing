class Eg
{
	void area(int b,int h)
	{
		int res=b*h;
		System.out.println("Area of triangle is "+res);
	}
}
class Triangle
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area(1,2);
	}
}