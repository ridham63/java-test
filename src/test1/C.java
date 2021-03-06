package test1;

import java.util.Arrays;

public class C {

	public static void main(String[] args) {
		bubblesort();
		mergesort();
	}

	public static void bubblesort() {
		/*
		* Time Complexity:
		* 	Best Case: O(N)
		* 	Average and worst case: O(N^2)
		*
		* Space Complexity: O(1)
		*
		* */

		// initial unsorted array
		int[] arr = {15, 48, 2, 35, 18, 27, 35, 94, 43, 9};
		System.out.print("Array : " + Arrays.toString(arr) + " \n");

		// loop for n^2 time and sort element from left to right
		// here after each loop left element should be smaller then right element
		// as we just swapping space complexity is same as array size
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("Array sorted : " + Arrays.toString(arr) + " \n");
	}

	public static void mergesort() {
		/*
		 * Time Complexity: O(N*logN)
		 *
		 * Space Complexity: O(N)
		 *
		 * */

		// initial unsorted array
		int[] array = {15, 48, 2, 35, 18, 27, 35, 94, 43, 9};

		// divide array into smallest sub arrays and merge together
		// sorting done when array are merged together
		// as we devide into sub array, space complexity is higher
		sort(array, 0, array.length - 1);

		System.out.print("Array sorted : " + Arrays.toString(array) + " \n");
	}

	public static void sort(int[] array, int left, int right) {
		// recursive call to divide arrays into sub arrays
		if (left < right) {
			int middle = (left + right) / 2;

			sort(array, left, middle);
			sort(array, middle + 1, right);

			merge(array, left, middle, right);
		}
	}

	// merging sub-arrays
	public static void merge(int[] arr, int left, int middle, int right) {

		// size of temporary arrays
		int n1 = middle - left + 1;
		int n2 = right - middle;

		// create temporary arrays
		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy sub-arrays to temporary arrays
		if (n1 >= 0) System.arraycopy(arr, left, L, 0, n1);
		for (int j = 0; j < n2; ++j)
			R[j] = arr[middle + 1 + j];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarrays
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy elements of L[] to array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy elements of R[] to array
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
