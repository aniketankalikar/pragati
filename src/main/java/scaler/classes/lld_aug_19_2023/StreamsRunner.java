package scaler.classes.lld_aug_19_2023;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsRunner {
	
	public static void main(String args[])
	{
		//question1();
		//question2();
		//question3();
		question4();
	}
	
	private static void question1()
	{
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().forEach(value -> System.out.println(value*value));
		
	}
	
	private static void question2()
	{
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream()
		.filter(value -> value%2==0)
		.forEach(value -> System.out.println(value));
		
	}
	
	private static void question3()
	{
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNos  =  numbers.stream()
		.filter(value -> value%2==0)
		.collect(Collectors.toList());
		
		System.out.println(evenNos);
		
	}
	
	private static void question4()
	{
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenSqaured = numbers.stream().filter(value -> value%2==0)
										   .map(value -> value*value).collect(Collectors.toList());
		
		System.out.println(evenSqaured);
	}

}