class Eg
{
	void area(int t,int r)
	{
		final double pi=3.142;
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
		q.area(10,1);
	}	
}