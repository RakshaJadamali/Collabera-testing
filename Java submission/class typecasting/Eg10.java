class Cool4
{
	void add()
	{
		System.out.println("Its add  method");
	}
}
class Goolata extends Cool4
{
	int r=7;
	void dispu()
	{
		System.out.println("Hey its dispu");
	}
}
class Eg10
{
	public static void main(String[]args)
	{
		Cool4 c4=new Goolata();
		c4.add();
		Goolata g2=(Goolata) c4;
		g2.add();
		System.out.println(g2.r);
		g2.dispu();
	}
}
		

	