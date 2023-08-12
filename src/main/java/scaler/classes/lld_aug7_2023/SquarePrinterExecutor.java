package scaler.classes.lld_aug7_2023;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SquarePrinterExecutor {
	
	public static void main(String args[])
	{
		
		Integer [] arr = new Integer[] {1,2,3,4,5};
		List<Integer> values = Arrays.asList(arr);
		
		Executor executor = Executors.newSingleThreadExecutor();
		Executor executorFixed = Executors.newFixedThreadPool(2);
		Executor cachedExecutor = Executors.newCachedThreadPool();
		
		for (Integer value : values) {
			//executor.execute(new SquarePrinter(value));
			//executorFixed.execute(new SquarePrinter(value));
			cachedExecutor.execute(new SquarePrinter(value));
		}
	}

}
