public class constructor
{
	int x;
	public constructor()
	{
		x = 25;
	}
	public static void main(String[] args)
	{
		constructor Obj = new constructor();
		System.out.println("x : " + Obj.x);
	}
}
