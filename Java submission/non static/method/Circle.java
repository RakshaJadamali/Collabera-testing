class Circle
{
	void area()
	{
		int r=1;
		final double pi=3.142;
		double res=pi*r*r;;
		System.out.println("Area of circle is "+res);
	}
	public static void main(String[]args)
	{
		new Circle().area();
	}
}