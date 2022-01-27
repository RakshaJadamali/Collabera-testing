class Sector
{
	static void area()
	{
		int r=17;
		double t=100;
		double tr=100*180*3.14;
		double res=0.5*r*r*tr;
		System.out.println(res);
	}
	public static void main(String[] args)
	{
		System.out.println("Area of sector is");
		area();
	}
}	