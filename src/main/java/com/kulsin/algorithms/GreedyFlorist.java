package com.kulsin.algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyFlorist {

	static int getMinimumCost(int k, int[] flowers) {
		Arrays.sort(flowers);

		int bought = 0;
		int totalCost = 0;
		int counter = 0;

		for (int x = flowers.length - 1; x >= 0; x--) {
			counter++;
			totalCost = totalCost + ((1 + bought) * flowers[x]);
			if (counter >= k && counter % k == 0) {
				bought++;
			}
		}
		return totalCost;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		System.out.println("Minimum cost:" + getMinimumCost(k, c));

		scanner.close();
	}
}
