package scaler.classes.lld_aug9_2023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String args[]) throws InterruptedException
	{
		Count count = new Count();
		Adder adder = new Adder(count);
		Subtractor subtractor = new Subtractor(count);
		
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(adder);
		executor.execute(subtractor);
		
		executor.awaitTermination(1, TimeUnit.SECONDS);
		System.out.println("Final Value is "+count.getValue());
	}
}
