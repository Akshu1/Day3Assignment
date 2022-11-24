package com.bridgelabz;

public class Largestelementinarray {
	static int arr[] = { 65, 24, 45, 90, 98, 625, 1000, 300, 6509 };

	static int largest() {
		int i;

		int max = arr[0];

		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest element in  array is =" + largest());
	}

}
