class Triangle
{
	double area()
	{
		int b=1;
		int h=2;
		double res=0.5*b*h;
		return res;
	}
	public static void main(String[]args)
	{
		double q=new Triangle().area();
		System.out.println(q);
	}
}
