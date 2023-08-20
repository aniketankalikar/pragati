package scaler.classes.lld_aug_16_2023;

import java.util.List;

public class Runner {
	
	public static void main(String args[])
	{
		
		/*
		 * Pair p1 = Pair.of("ANiket","aniket@gmail.com"); Pair p2 =
		 * Pair.of("ANiket","31-Oct-1980");
		 */
		
		Pair<String> p1 = new Pair<String>("ANiket","aniket@gmail.com"); 
		Pair<String> p2 = new Pair<String>("ANiket","31-Oct-1980");
		Pair<Integer> p3 = new Pair<Integer>(1,40);
		
		List<Pair<String>> lst = List.of(p1,p2);
		List<Pair<Integer>> lst2 = List.of(p3);
		
		for (Pair<String> pair : lst) {
			System.out.println("left "+pair.getLeft());
			System.out.println("Right "+pair.getRight());
		}
		
		for (Pair<Integer> pair : lst2) {
			System.out.println("left "+pair.getLeft());
			System.out.println("Right "+pair.getRight());
		}
		
	}

}
