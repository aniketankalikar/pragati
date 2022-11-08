package scaler.assigments.homework;

public class Arrays_Homework_Q6 {

	static void fun(int[] arr) {

		arr[3] = 98;

		return;

	}

	public static void main(String args[]) {

		int[] arr = { 10, 20, 30, 40, 50 };

		fun(arr);

		System.out.println(arr[3]);

	}

}
