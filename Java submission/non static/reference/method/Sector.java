class Eg
{
	void area()
	{
		final double pi=3.142;
		int t=10;
		int r=2;
		double tr=t*180*pi;
		double res=0.5*r*r*tr;
		System.out.println("Area of sector is "+res);
	}
}
class Sector
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area();
	}	
}