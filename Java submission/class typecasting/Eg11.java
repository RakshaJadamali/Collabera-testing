class Demo10
{
	double z=6.6d;
	int r=7;
}
class Dumtaka extends Demo10
{
	int x=10;
}
class Eg11
{
	public static void main(String[]args)
	{
		Demo10 d1=new Dumtaka();
		System.out.println(d1.z);
		System.out.println(d1.r);
		Dumtaka d=(Dumtaka) d1;
		System.out.println(d.x);
		System.out.println(d.z);
		System.out.println(d.r);
	}
}
		

	