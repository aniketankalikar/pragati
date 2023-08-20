package scaler.classes.lld_aug_16_2023;

public class Pair<TYPE> {

	private TYPE left;

	private TYPE right;

	public Pair(TYPE left, TYPE right) {
		this.left = left;
		this.right = right;

	}

	/*
	 * public static Pair of(TYPE left, TYPE right) { return new Pair(left, right);
	 * }
	 */

	public TYPE getLeft() {
		return left;
	}

	public void setLeft(TYPE left) {
		this.left = left;
	}

	public TYPE getRight() {
		return right;
	}

	public void setRight(TYPE right) {
		this.right = right;
	}

}
