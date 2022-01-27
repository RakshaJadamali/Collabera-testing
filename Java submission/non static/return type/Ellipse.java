class Ellipse
{
	double area()
	{
	 final double pi=3.142;
	 int a=3;
	 int b=4;
	 double res=pi*a*b;
	 return res;
	 }
	 public static void main(String[]args)
	 {
		double c=new Ellipse().area();
		System.out.println(c);
	}
}