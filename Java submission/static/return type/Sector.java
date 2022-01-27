class Eg
{
	static double area()
	{
	    int r =1;
	    int t=10;
            final double pi=3.142;
	    double tr=t*180*pi;
		double res=0.5*r*r*tr;
		return res;
	}
}
class Sector
{
	public static void main(String[]args)
	{
		double x=Eg.area();
		System.out.println("Area of sector is "+x);
	}
}
