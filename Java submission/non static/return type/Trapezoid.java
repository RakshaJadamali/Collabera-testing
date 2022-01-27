class Trapezoid
{
	double area()
	{
		int a=1;
		int b=2;
		int h=3;
		double res=0.5*(a+b)*h;
		return res;
	}
	public static void main(String[]args)
	{
		double z=new Trazpezoid().area();
		System.out.println(z);
	}
}

