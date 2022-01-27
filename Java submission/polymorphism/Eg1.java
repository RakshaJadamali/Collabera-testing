class Bookmyshow
{
	void tickets()
	{
		System.out.println("Booking");
	}
}
class Movies extends Bookmyshow
{
	void tickets()
	{
		System.out.println("Movie Booking");
	}
}
class Events extends Bookmyshow
{
	void tickets()
	{
		System.out.println("Events Booking");
	}
}
class Sports extends Bookmyshow
{
	void tickets()
	{
		System.out.println("Sports Booking");
	}
}
class Stimulator
{
	static void select(Bookmyshow a)
	{
		a.tickets();
	}
}
class Eg1
{
	public static void main(String[]args)
	{
		Movies m=new Movies();
		Events e=new Events();
		Sports s=new Sports();
		Stimulator.select(m);
		Stimulator.select(e);
		Stimulator.select(s);
	}
}