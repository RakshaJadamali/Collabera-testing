abstract  interface Sample2
{
	public abstract void fo();
	public abstract void disp();
}
abstract class Tester2 implements Sample2
{
	public void fo()
	{
		System.out.println("Hi");
	}
	public abstract void disp();
}
class Demo2 extends Tester2
{
	public void disp()
	{
		System.out.println("Hello");
	}
	public static void main(String[]args)
	{
		Demo2 d2=new Demo2();
		d2.fo();
		d2.disp();
	}
}
