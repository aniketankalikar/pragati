package scaler.classes.lld_aug_19_2023;

public class Printer implements Runnable{

	@Override
	public void run() {
		System.out.println("Hello WOrld "+Thread.currentThread().getName());
	}

	
}
