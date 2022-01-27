class Cola1
{
	int f=70;
}
class Chungacha extends Cola1
{
	int d=60;
}
class Eg6
{
	public static void main(String[]args)
	{
		Cola1 c1=new Chungacha();
		System.out.println(c1.f);
		Chungacha c=(Chungacha) c1;
		System.out.println(c.f);
		System.out.println(c.d);
	}
}
		

	