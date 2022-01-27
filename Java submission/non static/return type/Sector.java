class Sector
{
	double area()
	{
		int r=5;
		int t=10;
		final double pi=3.142;
		double tr=t*180*pi;
		double res=0.5*r*r*tr;
		return res;
	}
	public static void main(String[]args)
	{
		double c=new Sector().area();
		System.out.println(c);
	}
}