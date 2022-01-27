class Cool2
{
	void disp()
	{
		System.out.println("Its disp");
	}
}
class Dinga extends Cool2
{
	int x=25;
	void tata()
	{
		System.out.println("Hi tata");
	}
}
class Eg8
{
	public static void main(String[]args)
	{
		Cool2 c2=new Dinga();
		c2.disp();
		Dinga d2=(Dinga) c2;
		d2.disp();
		System.out.println(d2.x);
		d2.tata();
	}
}
		

	