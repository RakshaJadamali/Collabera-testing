class Circle
{
	void area(int r)
	{	
		final double pi=3.142;
		double res=pi*r*r;
		System.out.println("Area of Circle is "+res);
	}
	public static void main(String[]args)
	{
		new Circle().area(3);
	}
}