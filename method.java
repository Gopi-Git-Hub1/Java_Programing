class method
{
	public static int function1(int a, int b)
	{
		return a+b;
	}
	public static String function2(String x, String y)
	{ 
		String str = x + y;
		return str;
	}
	 static void function3()
	{
		System.out.println("Method Called..!");
	}
	public static void main(String[] args){
		int sum = function1(10,20);
		String str = function2("Capgemini ", "Bangalore");
		System.out.println("Sum : "+ sum);
		System.out.println("Concatename String : "+ str);
		//method Obj = new method();
		//Obj.function3();
		function3();
	}
}
