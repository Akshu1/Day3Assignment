package com.bridgelabz;

public class ReverseArray {

	static void reverse(int a[], int b) {
		int c[] = new int[b];
		int j = b;
		for (int i = 0; i < b; i++) {
			c[j - 1] = a[i];
			j = j - 1;
		}

		System.out.println("Reversed array is: \n");

		for (int k = 0; k < b; k++) {
			System.out.println(c[k]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 6, 3, 4, 10 };
		reverse(arr, arr.length);

	}
}