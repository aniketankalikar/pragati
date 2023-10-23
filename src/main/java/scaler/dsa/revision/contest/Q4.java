package scaler.dsa.revision.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Q4 {

	public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> b.value - a.value);

		// Initialize the heap with the first k elements
		for (int i = 0; i < B; i++) {
			heap.offer(new Pair(A.get(i), i));
		}

		// The maximum element in the first window
		ans.add(heap.peek().value);

		// Process the remaining elements
		for (int i = B; i < A.size(); i++) {
			heap.offer(new Pair(A.get(i), i));

			// Remove elements that are outside the current
			// window
			while (heap.peek().index <= i - B) {
				heap.poll();
			}

			// The maximum element in the current window
			ans.add(heap.peek().value);
		}

		return ans;

	}

	static class Pair {
		int value;
		int index;

		public Pair(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}

}