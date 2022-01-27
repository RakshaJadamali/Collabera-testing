class Whatsapp_v1
{
	void videocall()
	{
		System.out.println("videocall with 1 person");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void videocall()
	{
		System.out.println("videocall with 8 people");
	}
}
class Eg
{
	public static void main(String[]args)
	{
		Whatsapp_v2 v2=new Whatsapp_v2();
		v2.videocall();
	}
}