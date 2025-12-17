public class class_object
{
	int x = 10;
	//final int x = 10;
	public static void main(String[] args)
	{
		class_object Obj = new class_object();
		Obj.x = 25; // will generate an error: cannot assign a value to a final variable
		System.out.println("class_object value of X : "+ Obj.x);
	}
		
}
