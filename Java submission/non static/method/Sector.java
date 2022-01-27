class Sector
{
	void area()
	{
		int r=1;
		final double pi=3.142;
		int t=10;
		double tr=t*180*pi;
		double res=0.5*r*r*tr;
		System.out.println("Area of sector is "+res);
	}
	public static void main(String[]args)
	{
		new Sector().area();
	}
}