class Eg
{
	static int area()
	{
		int h=1;
		int b=2;
	    int res=h*b;
		return res;
	}
}
class Parallelogram
{
	public static void main(String[]args)
	{
		int x=Eg.area();
		System.out.println("Area of parallelogram is "+x);
	}
}