class Parallelogram
{
	void area(int b,int h)
	{	
		int res=b*h;
		System.out.println("Area of parallelogram is "+res);
	}
	public static void main(String[]args)
	{
		new Parallelogram().area(1,2);
	}
}