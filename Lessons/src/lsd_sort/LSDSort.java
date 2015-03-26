package lsd_sort;

import java.util.Arrays;
import java.util.Random;

public class LSDSort {

	private static final int ITERATIONS = 100;
	private static final int MAX = 1000000;
	static final int W = 4;
	static final int R = 256;

	public static void main(final String[] args) {

		long start;
		long stop;
		
		long total = 0;
		long totalOriginal = 0;

		for (int i = 0; i < ITERATIONS; i++) {

			int[] data = generate();

			int[] data1 = data.clone();

			start = System.nanoTime();
			Arrays.sort(data);
			stop = System.nanoTime();
			totalOriginal += (stop - start);

			start = System.nanoTime();
			sort(data1);
			stop = System.nanoTime();
			
			total += (stop - start);

			if (!Arrays.equals(data, data1)) {
				System.out.println("wrong! not equals!");
			}
		}
		
		System.out.println("total original " + totalOriginal / ITERATIONS);
		System.out.println("total LSD " + total / ITERATIONS);
		System.out.println("ratio " + (double)totalOriginal / (double)total);

	}

	private static void sort(int[] data) {

		int[] aux = new int[data.length];

		int[] count = new int[R + 1];

		for (int d = 0; d < W * 8; d += 8) {

			for (int i = 0; i < data.length; i++) {
				count[(data[i] >>> d & 0xFF) + 1]++;
			}

			for (int r = 0; r < R; r++) {
				count[r + 1] += count[r];
			}

			for (int i = 0; i < data.length; i++) {
				aux[count[data[i] >>> d & 0xFF]++] = data[i];
			}

			int[] tmp = aux;
			aux = data;
			data = tmp;
			
			Arrays.fill(count, 0);
		}
	}

	private static int[] generate() {
		int[] data = new int[MAX];

		Random random = new Random();

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(Integer.MAX_VALUE); // [0 .. MAX-1]
		}

		return data;
	}

}