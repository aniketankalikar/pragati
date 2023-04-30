package scaler.assigments.homework;

public class Advance_Tries_Assignment_1 {

	public static void main(String args[]) {
		Node root = new Node(' ');
		String[] A = new String[] { "zebra", "dog", "duck", "dove" };
		new Advance_Tries_Assignment_1().insert(root, "zebra");
		new Advance_Tries_Assignment_1().insert(root, "dog");
		new Advance_Tries_Assignment_1().insert(root, "duck");
		new Advance_Tries_Assignment_1().insert(root, "dove");
		new Advance_Tries_Assignment_1().uniquePrefix(root, A);
		/*
		 * boolean search = new Advance_Tries_Assignment_1().search(root, "play");
		 * System.out.println(search); int frq = new
		 * Advance_Tries_Assignment_1().frequency(root, "play");
		 * System.out.println(frq);
		 */

	}

	public void insert(Node root, String word) {
		Node temp = root;
		int n = word.length();
		char ch = ' ';
		int index = 0;

		for (int i = 0; i < n; i++) {
			ch = word.charAt(i);
			index = ch - 'a';
			if (temp.children[index] == null) {
				Node nn = new Node(ch);
				temp.children[index] = nn;
			}
			temp.pf += 1;
			temp = temp.children[index];
			
		}

		temp.frequency++;
		temp.isEnd = true;
	}

	public boolean search(Node root, String word) {
		Node temp = root;
		int n = word.length();
		char ch = ' ';
		int index = 0;
		for (int i = 0; i < n; i++) {
			ch = word.charAt(i);
			index = ch - 'a';
			if (temp.children[index] == null) {
				return false;
			}
			temp = temp.children[index];
		}
		return temp.isEnd;
	}

	public int frequency(Node root, String word) {
		Node temp = root;
		int n = word.length();
		char ch = ' ';
		int index = 0;

		for (int i = 0; i < n; i++) {
			ch = word.charAt(i);
			index = ch - 'a';
			if (temp.children[index] == null) {
				return -1;
			}
			temp = temp.children[index];
		}
		return temp.frequency;
	}

	public String[] uniquePrefix(Node root, String[] A) {
		String[] res = new String[A.length];
		
		for (int i = 0; i < A.length; i++) {
			String input = A[i];
			Node temp = root;
			int index = 0;
			String prefix = "";
			for (int j = 0; j < input.length(); j++) {
				char ch = input.charAt(j);
				index = ch - 'a';
				if (temp.children[index] != null) {
					
					if (temp.pf == 1) {
						break;
					} else {
						prefix += String.valueOf(ch);
						
					}
					temp = temp.children[index];

				}
				res[i] = (prefix == "") ? String.valueOf(ch) : prefix;
			}
		}

		return res;
	}

}

class Node {
	boolean isEnd;
	int frequency = 0;;
	Node children[];
	char ch = ' ';
	int pf;

	public Node(char chr) {
		this.isEnd = false;
		this.children = new Node[26];
		this.ch = chr;
		pf = 0;
	}

}
