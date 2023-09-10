package scaler.lld.contest1.Problem7;

public class Client {
	public static void main(String args[])
	{
		// Below line will cause compile time error
		//ClassB obj = new ClassA();
		
		ClassA obj = new ClassB();
		obj.fun();
	}

}
