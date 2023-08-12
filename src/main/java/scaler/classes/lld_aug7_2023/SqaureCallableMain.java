package scaler.classes.lld_aug7_2023;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SqaureCallableMain {

	public static void main(String args[]) throws Exception {

		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };
		List<Integer> values = Arrays.asList(arr);

		ExecutorService executor = Executors.newCachedThreadPool();

		for (Integer value : values) {
			// executor.execute(new SquarePrinter(value));
			// executorFixed.execute(new SquarePrinter(value));
			Future<Integer> future = executor.submit(new SquareCallable(value));
			System.out.println(future.get() + " Printed By " +Thread.currentThread().getName());
		}
	}

}
