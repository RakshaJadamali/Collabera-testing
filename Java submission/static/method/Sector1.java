class Demo
{
	static double area(int r,int t)
	{
		final double pi=3.142;
		double tr=t*180*pi;
		double res=0.5*r*tr;
		return res;
	}
}
class Sector1
{
	public static void main(String[]args)
	{
		double x=Demo.area(1,10);
		System.out.println("Area is "+x);
	}
}	