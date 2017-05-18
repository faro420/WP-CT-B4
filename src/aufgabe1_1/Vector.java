/*
 * @author:  Mir Farshid Baha
 * @subject: WP-CT Blatt 4
 * @version: 1.0
 */
package aufgabe1_1;

public class Vector {
	private int[] args;
	private int size;

	public Vector(int... args) {
		size = args.length;
		this.args = new int[size];
		for (int i = 0; i < size; i++) {
			this.args[i] = args[i];
		}
	}

	public int getN(int n) {
		return args[n];
	}

	public void setN(int i, int n) {
		args[i] = n;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		System.out.print("[");
		for (int i = 0; i < size - 1; i++) {
			if (i != size - 2) {
				System.out.print(args[i] + ",");
			} else {
				System.out.print(args[i]);
			}

		}
		System.out.println("|" + args[size - 1] + "]");
	}

	@Override
	public boolean equals(Object other) {
		Vector vec = (Vector) other;
		boolean result = true;
		for (int i = 0; i < size; i++) {
			if (args[i] != vec.getN(i)) {
				result = false;
				i = size;
			}
		}
		return result;
	}

}
