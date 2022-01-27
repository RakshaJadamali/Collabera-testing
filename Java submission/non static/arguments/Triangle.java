class Triangle
{
	void area(int b,int h)
	{	
		double res=0.5*b*h;
		System.out.println("Area of triangle is "+res);
	}
	public static void main(String[]args)
	{
		new  Triangle().area(1,2);
	}
}