class Eg
{
	static int area()
	{
		int w=1;
		int h=2;
		int res=w*h;
		return res;
	}
}
class Rectangle
{
	public static void main(String[]args)
	{
		int x=Eg.area();
		System.out.println("Area of rectangle is "+x);
	}
}