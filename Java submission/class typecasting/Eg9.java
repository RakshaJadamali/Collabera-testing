class Tester3
{
	int r=75;
	void disp()
	{
		System.out.println("Hey disp");
	}
}
class Tisto1 extends Tester3
{
	void uliya()
	{
		System.out.println("Hey uliya");
	}
}
class Eg9
{
	public static void main(String[]args)
	{
		Tester3 t3=new Tisto1();
		System.out.println(t3.r);
		t3.disp();
		Tisto1 t1=(Tisto1) t3;
		System.out.println(t1.r);
		t1.disp();
		t1.uliya();
	}
}
		

	