class Eg
{
	static int area()
	{
		int a=1;
		int res=a*a;
		return res;
	}
}
class Square
{
	public static void main(String[]args)
	{
		int x=Eg.area();
		System.out.println("Area of square is "+x);
	}
}