class Eg
{
	void area(int w,int h)
	{
		int res=w*h;
		System.out.println("Area of rectangle is "+res);
	}
}
class Rectangle
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area(1,2);
	}
}