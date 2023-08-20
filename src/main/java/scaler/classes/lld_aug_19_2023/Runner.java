package scaler.classes.lld_aug_19_2023;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		/*
		 * Printer printer = new Printer(); printer.run();
		 */

		/*
		 * Thread thread = new Thread(new Runnable() {
		 * 
		 * @Override public void run() {
		 * System.out.println("Tantia Tope "+Thread.currentThread().getName());
		 * 
		 * } });
		 * 
		 * thread.start();
		 */
		
		/*
		 * Runnable runnable = () -> {
		 * 
		 * System.out.println("Tantia Tope "+Thread.currentThread().getName()); };
		 * 
		 * Thread th = new Thread(runnable); th.start();
		 * 
		 * Callable<String> callable = () -> "Test Callable";
		 * 
		 * Future<String> value = Executors.newSingleThreadExecutor().submit(callable);
		 * System.out.println("Callable "+value.get());
		 */
		
		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		
		System.out.println(add.operate(1, 2));
		System.out.println(sub.operate(3, 1));
				
	}
}
