class Network
{
	void buy()
	{
		System.out.println("Types of network");
	}
}
class Airtel extends Network
{
	void buy()
	{
		System.out.println("Airtel network");
	}
}
class Vi extends Network
{
	void buy()
	{
		System.out.println("Vi Network");
	}
}

class Jio extends Network
{
	void buy()
	{
		System.out.println("Jio network");
	}
}
class Stimulator
{
	static void buy( Network a)
	{
		a.buy();
	}
}
class Eg3
{
	public static void main(String[]args)
	{
		Airtel a1=new Airtel();
		Vi v=new Vi();
		Jio j=new Jio();
		Stimulator.buy(a1);
		Stimulator.buy(v);
		Stimulator.buy(j);
	}
}