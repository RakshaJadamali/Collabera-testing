class Cola13
{
	int f=100;
	void disp()
	{
		System.out.println("Hello");
	}
}
class Chungacha extends Cola13
{
	int d=7;
}
class Eg13
{
	public static void main(String[]args)
	{
		Cola13 c1=new Chungacha();
		c1.disp();
		System.out.println(c1.f);
		Chungacha c=(Chungacha) c1;
		System.out.println(c.d);
		System.out.println(c.f);
		c.disp();
	}
}
		

	