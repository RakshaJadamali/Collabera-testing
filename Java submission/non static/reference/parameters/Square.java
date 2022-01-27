class Eg
{
	void area(int a)
	{
		int res=a*a;
		System.out.println("Area of square is "+res);
	}
}
class Square
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area(1);
	}
}