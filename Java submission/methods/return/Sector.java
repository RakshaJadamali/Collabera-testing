class Sector
{	
	static double area()
	{
		final double pi=3.142;
		double tr=100*180*pi;
		int r=1;
		double res=0.5*r*r*tr;
		return res;
	}
	public static void main(String[]args)
	{
		double q=area();
		System.out.println("Area of sector "+q);
	}
}
		