class Rectangle
{
	void area()
	{
		int w=1;
		int h=2;
		int res=w*h;
		System.out.println("Area of rectangle is "+res);
	}
	public static void main(String[]args)
	{
		new Rectangle().area();
	}
}