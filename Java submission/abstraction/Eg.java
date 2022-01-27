interface Animal
{
	void noise();
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("Meow");
	}
}
class Snake implements Animal
{
	public void noise()
	{
		System.out.println("Hiss Hiss");
	}
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Bow bow");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
class Eg
{
	public static void main(String[]args)
	{
		Cat c1=new Cat();
		Snake s1=new Snake();
		Dog d1=new Dog();
		Stimulator.ansim(c1);
		Stimulator.ansim(s1);
		Stimulator.ansim(d1);
	}
}

	