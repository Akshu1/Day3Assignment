package com.bridgelabz;

public class Frequency {

	public static void main(String[] args) {

		int array[] = { 1, 2, 4, 6, 7, 8, 3, 2, 2, 5, 7, 7, 1, 9, 10 };

		int freq[] = new int[array.length];
		int node = -1;
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;

					freq[j] = node;
				}
			}
			if (freq[i] != node)
				freq[i] = count;
		}

		System.out.println(" Element - Frequency");

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != node)
				System.out.println("    " + array[i] + "              " + freq[i]);
		}

	}
}
