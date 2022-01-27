interface Puma
{
	void shoes();
}
interface Nike extends Puma
{
	public abstract void bags();
	public abstract void shoes();
}
class Rajoutlet implements Nike
{
	public void bags()
	{
		System.out.println("Jingalala bags");
	}
	public void shoes()
	{
		System.out.println("Jingi jingi bags");
	}
}
class Eg1
{
	public static void main(String[]args)
	{
		Rajoutlet r1=new Rajoutlet();
		r1.bags();
		r1.shoes();
	}
}