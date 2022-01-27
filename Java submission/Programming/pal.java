class pal
{
	public static void main(String[]args)
	{
		String s1="mom";
		String re="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			re=re+s1.charAt(i);
		}
		if(s1.equals(re))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}