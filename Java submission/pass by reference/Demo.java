class Demo
{
	String icecream="Vanilla";
	static void dingi(Demo d2)
	{
		System.out.println(d2.icecream);
	}
	public static void main(String[]args)
	{
		Demo d1=new Demo();
		System.out.println(d1.icecream);
		dingi(d1);
	}
}