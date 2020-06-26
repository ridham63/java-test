package test1;

import java.util.Arrays;

public class C {

	public static void main(String[] args) {
		bubblesort();
		mergesort();
	}

	public static void bubblesort() {
		int[] arr = {15, 48, 2, 35, 18, 27, 35, 94, 43, 9};
		System.out.print("Array : " + Arrays.toString(arr) + " \n");
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
		int[] arr = {15, 48, 2, 35, 18, 27, 35, 94, 43, 9};
		sort(arr, 0, arr.length - 1);
		System.out.print("Array sorted : " + Arrays.toString(arr) + " \n");
	}

	public static void sort(int[] arr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			// Sort first and second halves
			sort(arr, left, middle);
			sort(arr, middle + 1, right);

			// Merge the sorted halves
			merge(arr, left, middle, right);
		}
	}

	public static void merge(int[] arr, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		int[] L = new int[n1];
		int[] R = new int[n2];

		/*Copy data to temp arrays*/
		if (n1 >= 0) System.arraycopy(arr, left, L, 0, n1);
		for (int j = 0; j < n2; ++j)
			R[j] = arr[middle + 1 + j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
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

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
