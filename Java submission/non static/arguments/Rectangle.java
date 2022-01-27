class Rectangle
{
	void area(int w,int h)
	{	
		int res=w*h;
		System.out.println("Area of rectangle is "+res);
	}
	public static void main(String[]args)
	{
		new  Rectangle().area(1,2);
	}
}