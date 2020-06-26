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
		* 	Avarage and worst case: O(N^2)
		*
		* Space Complexity: O(1)
		*
		* */
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
		/*
		 * Time Complexity: O(N*logN)
		 *
		 * Space Complexity: O(N)
		 *
		 * */
		int[] array = {15, 48, 2, 35, 18, 27, 35, 94, 43, 9};
		sort(array, 0, array.length - 1);
		System.out.print("Array sorted : " + Arrays.toString(array) + " \n");
	}

	public static void sort(int[] array, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			sort(array, left, middle);
			sort(array, middle + 1, right);

			merge(array, left, middle, right);
		}
	}

	public static void merge(int[] arr, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;

		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy data to temp arrays
		if (n1 >= 0) System.arraycopy(arr, left, L, 0, n1);
		for (int j = 0; j < n2; ++j)
			R[j] = arr[middle + 1 + j];

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

		// Copy elements of L[]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy elements of R[]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
