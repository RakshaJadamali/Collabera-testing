class Images
{
	void share()
	{
		System.out.println("Sharing of images");
	}
}
class Whatsapp extends Images
{
	void share()
	{
		System.out.println("Whatsapp images");
	}
}
class Hike extends Images
{
	void share()
	{
		System.out.println("Hike images");
	}
}
class Telegram extends Images
{
	void share()
	{
		System.out.println("Telegram images");
	}
}
class Stimulator
{
	static void buy(Images a)
	{
		a.share();
	}
}
class Eg4
{
	public static void main(String[]args)
	{
		Whatsapp w=new Whatsapp();
		Hike h=new Hike();
		Telegram t=new Telegram();
		Stimulator.buy(w);
		Stimulator.buy(h);
		Stimulator.buy(t);
	}
}
