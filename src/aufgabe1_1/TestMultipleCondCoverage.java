/*
 * @author:  Mir Farshid Baha
 * @subject: WP-CT Blatt 4
 * @version: 1.0
 */
package aufgabe1_1;

import java.util.ArrayList;

public class TestMultipleCondCoverage {
	public static void main(String[] args) {
		Vector[] vectors = { new Vector(0, 0, 0, 1), new Vector(1, 0, 0, 0), new Vector(0, 1, 0, 0),
				new Vector(1, 1, 0, 0), new Vector(0, 0, 1, 1), new Vector(1, 0, 1, 0), new Vector(0, 1, 1, 1),
				new Vector(1, 1, 1, 0) };
		TestMultipleCondCoverage.printResultVectors(vectors);
	}

	public static void printResultVectors(Vector[] args) {
		ArrayList<Vector> results = new ArrayList<Vector>();
		boolean equal = false;
		int rowSize = args[0].getSize();
		int columnSize = args.length;
		int[] tempInit = new int[rowSize];
		Vector temp = new Vector(tempInit);
		temp.setN(rowSize - 1, args[0].getN(rowSize - 1));
		results.add(args[0]);

		for (int i = 0; i < rowSize; i++) {
			temp.setN(i, 1);
			for (int j = 0; j < columnSize; j++) {
				equal = compare(temp, args[j]);
				if (equal) {
					if (temp.getN(rowSize - 1) != args[j].getN(rowSize - 1)) {
						if (!results.contains(args[j])) {
							results.add(args[j]);
						}
						if (i < rowSize - 1) {
							temp.setN(i + 1, 1);
							temp.setN(rowSize - 1, args[j].getN(rowSize - 1));
						}
					}
				}
			}
			temp = new Vector(tempInit);
			temp.setN(rowSize - 1, args[0].getN(rowSize - 1));
		}

		System.out.println("Result Vectors:");
		int resultsLength = results.size();
		for (int i = 0; i < resultsLength; i++) {
			results.get(i).print();
		}
	}

	private static boolean compare(Vector a, Vector b) {
		boolean result = true;
		int size = a.getSize();
		for (int i = 0; i < size - 1; i++) {
			if (a.getN(i) != b.getN(i)) {
				result = false;
				i = size;
			}
		}
		return result;
	}
}
