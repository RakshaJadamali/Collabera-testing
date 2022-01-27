class Parallelogram
{
	int area()
	{
		int b=5;
		int h=6;
		int res=b*h;
		return res;
	}
	public static void main(String[]args)
	{
		int t=new Parallelogram().area();
		System.out.println(t);
	}
}