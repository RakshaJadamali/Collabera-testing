class Tester1
{
	int x=5;
	void disp()
	{
		System.out.println("Hello");
	}
}
class Huliyacha extends Tester1
{
	void ho()
	{
		System.out.println("Hey");
	}
}
class Eg7
{
	public static void main(String[]args)
	{
		Tester1 t1=new Huliyacha();
		System.out.println(t1.x);
		t1.disp();
		Huliyacha h1=(Huliyacha) t1;
		System.out.println(h1.x);
		h1.disp();
		h1.ho();
	}
}
		

	