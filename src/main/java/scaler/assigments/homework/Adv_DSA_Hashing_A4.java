package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Adv_DSA_Hashing_A4 {

	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		/*
		 * ArrayList<Integer> arrList = new ArrayList<Integer>(); arrList.add(2);
		 * arrList.add(5); B.add(arrList); arrList = new ArrayList<Integer>();
		 * arrList.add(1); arrList.add(7); B.add(arrList); arrList = new
		 * ArrayList<Integer>(); arrList.add(2); arrList.add(9); B.add(arrList);
		 */

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(3);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(3);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(4);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(2);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(1);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(2);
		arrList.add(3);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(5);
		B.add(arrList);
		arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(5);
		B.add(arrList);

		ArrayList<Integer> result = new Adv_DSA_Hashing_A4().solve("10010", B);
		System.out.println(result);
	}

	public ArrayList<Integer> solve(String A, ArrayList<ArrayList<Integer>> B) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		String temp = A;
		
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i) == '1')
				treeSet.add(i);
		}
		
		for (ArrayList<Integer> arrayList : B) {
			
			int type = arrayList.get(0);
			int index = arrayList.get(1);

			if (type == 1) {
				StringBuilder string = new StringBuilder(temp);
				string.setCharAt(index - 1, A.charAt(index - 1) == '0' ? '1' : '0');
				temp = string.toString();

				// Update the treeset
				if (treeSet.contains(index - 1)) {
					treeSet.remove(index - 1);
				} else {
					treeSet.add(index - 1);
				}

			} else if (type == 2) {

				if (!treeSet.isEmpty()) {
					int lower = treeSet.lower(index - 1);
					result.add(lower);
				}

			}
		}

		return result;
	}

}