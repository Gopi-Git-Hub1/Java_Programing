class Base
{
	protected String BaseName = "Base Class";
	public void display() {                    // Vehicle method
		System.out.println("Name : "+BaseName);
	}
}
class Derived extends Base
{
	private String DerivedName = "Derived Class";
	public static void main(String[] args)
	{
		Derived Obj = new Derived();
		Obj.display();
		System.out.println(Obj.BaseName + " \n" + Obj.DerivedName);

	}
}


