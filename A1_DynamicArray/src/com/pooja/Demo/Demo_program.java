package com.pooja.Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements inside array : ");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Arrays with duplicates : "+Arrays.toString(arr));
		
		int[] arr2 = new int[arr.length]; // Temporary array to store unique elements
		int k = 0;
				
				// 1. Loop through the original array
				for (int i = 0; i < arr.length; i++) {
					boolean isDuplicate = false;

				//2. Check if the current element is already in the new array
				for (int j = 0; j < k; j++) {
					if (arr[i] == arr2[j]) {
						isDuplicate = true; // If duplicate found, set flag
						break;
					}
				}

				//3. If the element is not a duplicate, add it to arr2
				if (!isDuplicate) {
					arr2[k++] = arr[i];
				}
		}

		// Print the unique elements in the new array
		System.out.print("Array after removing duplicates: ");
		for (int i = 0; i < k; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
