class Demo
{
	int x=50;
}
class Penocha extends Demo
{
	void ho()
	{
		System.out.println("Hello");
	}
}
class Eg
{
	public static void main(String[]args)
	{
		Demo d1=new Penocha();
		System.out.println(d1.x);
		Penocha p1=(Penocha) d1;
		System.out.println(p1.x);
		p1.ho();
	}
}
		

	