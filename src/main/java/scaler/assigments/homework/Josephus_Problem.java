package scaler.assigments.homework;

import java.util.ArrayList;
import java.util.List;

public class Josephus_Problem {

	public static void main(String args[]) {
		new Josephus_Problem().solve(9, 4);
	}

	public int solve(int A, int B) {

		List<Integer> peoples = new ArrayList<Integer>();
		for (int i = 1; i <= A; i++) {
			peoples.add(i);
		}

		int res = josephusProblem(peoples, 0, B);

		return res;
	}

	int josephusProblem(List<Integer> peoples, int index, int B) {

		if (peoples.size() == 1)
			return peoples.get(0);

		int killingIndex = (index + B - 1) % peoples.size();
		peoples.remove(killingIndex);
		// [0,1,2,3] => remove 2nd index => [0,1,3] ,now index 2 represent value 3 which
		// was earlier 2
		int startIndex = killingIndex;
		return josephusProblem(peoples, startIndex, B);
	}
}
