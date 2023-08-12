package scaler.classes.lld_aug7_2023;

import java.util.Arrays;
import java.util.List;

public class SquarePrintRunner {
	
	public static void main(String args[])
	{
		
		Integer [] arr = new Integer[] {1,2,3,4,5};
		List<Integer> values = Arrays.asList(arr);
		
		for (Integer value : values) {
			Thread thread  = new Thread(new SquarePrinter(value));
			thread.start();
		}
	}

}
