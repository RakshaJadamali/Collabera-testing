abstract  interface Sample
{
	public abstract void disp();
	public abstract void cool();
}
class Demo1 implements Sample
{
	public void disp()
	{
		System.out.println("Hi");
	}
	public void cool()
	{
		System.out.println("Hello");
	}
}
class Eg
{
	public static void main(String[]args)
	{
		Demo1 d1=new Demo1();
		d1.disp();
		d1.cool();
	}
}

