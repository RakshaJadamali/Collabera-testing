class Eg
{
	void area()
	{
		final double pi=3.142;
		int r=6;
		double res=pi*r*r;
		System.out.println(res);
	}
}
class Circle
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area();
	}	
}