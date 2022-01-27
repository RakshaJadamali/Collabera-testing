class Sector
{
	static void area(int r,double t)
	{
		final double pi=3.142;
		double tr=100*180*pi;
		double res=0.5*r*r*tr;
		System.out.println("Area of sector is"+res);
	}
	public static void main(String[]args)
	{
		area(1,20);
	}
}
