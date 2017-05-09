package aufgabe1_1;

public class TestMultipleCondCoverage {
	public static void main(String[] args) {
		Vector[] vectors = { new Vector(0, 0, 0, 1), new Vector(1, 0, 0, 0), new Vector(0, 1, 0, 0),
				new Vector(1, 1, 0, 0), new Vector(0, 0, 1, 1), new Vector(1, 0, 1, 0), new Vector(0, 1, 1, 1),
				new Vector(1, 1, 1, 0) };
		TestMultipleCondCoverage.printResultVectors(vectors);
	}

	public static void printResultVectors(Vector[] args) {
		int size = args[0].getSize();
		int [] tempInit = new int[size]; 
		Vector temp = new Vector(tempInit);
		temp.setN(size-1, args[0].getN(size-1));
		System.out.println("Result Vectors:");
		print(temp);
//		for(int i=0; i< temp)
//		System.out.println("[" + temp.getX() + "," + temp.getY() + "," + temp.getZ() + "|" + temp.getB() + "]");
//		for int 
	}

	private static void print(Vector vec) {
		int size = vec.getSize();
		System.out.print("[");
		for (int i = 0; i < size; i++) {
			if (i != size - 1) {
				System.out.print(vec.getN(i) + ",");
			} else {
				System.out.print("|" + vec.getN(i));
			}

		}
		System.out.println("]");
	}
}
