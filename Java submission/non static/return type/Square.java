class Square
{
	int area()
	{
		int a=2;
		int res=a*a;
		return res;
	}
	public static void main(String[]args)
	{
	int q=new Square().area();
	System.out.println(q);
	}
}