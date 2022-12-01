package scaler.assigments.homework;

public class BitMap2_Homework_Q1 {
	
	public static void main(String args[])
	{
		int A =4;
		int B =1;
		System.out.println("A-->"+A);
		System.out.println(A^(1<<B));
		
		String binary  = Integer.toBinaryString(45);
		System.out.println("binary ---> "+binary);
		
		String binaryValue = Long.toBinaryString(93L);
		StringBuilder builder = new StringBuilder(binaryValue);
		builder = builder.reverse();
		builder = new StringBuilder(builder.toString().substring(0,4).replace("1", "0").concat(builder.substring(4, builder.toString().length()))) ;
		builder = builder.reverse();
		Long decimalRevised  = Long.parseLong(builder.toString(), 2);
		System.out.println("decimalRevised --> "+decimalRevised);
		
	}

}
