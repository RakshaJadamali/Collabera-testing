class Circle
{	
	static double area()
	{
		final double pi=3.142;
		int r=1;
		double res=pi*r*r;
		return res;
	}
	public static void main(String[]args)
	{
		double q=area();
		System.out.println("Area of circle "+q);
	}
}
		