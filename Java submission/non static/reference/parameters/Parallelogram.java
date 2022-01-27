class Eg
{
	void area(int b,int h)
	{
		int res=b*h;
		System.out.println("Area of parallelogram is "+res);
	}
}
class Parallelogram
{
	public static void main(String[]args)
	{
		Eg q=new Eg();
		q.area(1,2);
	}	
}