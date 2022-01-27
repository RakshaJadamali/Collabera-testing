class Sample2
{
	void co()
	{
		System.out.println("Hello");
	}
}
class Guleyluu extends Sample2
{
	void disp()
	{
		System.out.println("Hi");
	}
}
class Eg5
{
	public static void main(String[]args)
	{
		Sample2 s2=new Guleyluu();
		s2.co();
	    Guleyluu a=(Guleyluu) s2;
		a.co();
		a.disp();
	}
}
		

	