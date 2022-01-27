class Sector
{
	void area(int r,int t)
	{
		final double pi=3.142;
		double tr=pi*180*t;
		double res=0.5*r*r*tr;
		System.out.println(res);
	}
	public static void main(String[]args)
	{
		new Sector().area(2,30);
	}
}
		