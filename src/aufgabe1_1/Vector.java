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

}
