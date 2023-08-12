package scaler.classes.lld_aug7_2023;

public class SquarePrinter implements Runnable {

	@SuppressWarnings("unused")
	private Integer number;

	public SquarePrinter(Integer no) {
		this.number = no;
	}

	public void run() {
		System.out.println(number * number + " printed by" + Thread.currentThread().getName());
	}

}
