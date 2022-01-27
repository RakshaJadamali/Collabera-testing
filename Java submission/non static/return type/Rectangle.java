class Rectangle
{
	int area()
	{
		int w=3;
		int h=4;
		int res=w*h;
		return res;
	}
	public static void main(String[]args)
	{
		int e=new Rectangle().area();
		System.out.println(e);
	}
}