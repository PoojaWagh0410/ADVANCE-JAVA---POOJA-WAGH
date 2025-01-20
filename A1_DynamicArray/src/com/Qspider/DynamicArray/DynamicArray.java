package com.Qspider.DynamicArray;

public class DynamicArray {
	private int[] arr = new int[5];

	private int index = 0;

	private int capacity = arr.length;

	public void add(int num) {
		if (index == (capacity-1)) {
			int[] temp = new int[2 * capacity];

			for (int i = 0; i < index; i++) {
				temp[i] = arr[i];
			}
			System.out.println("Before Capacity : " + capacity);

			arr = temp;
			capacity = arr.length;
			System.out.println("After Capacity : " + capacity);
		}
		arr[index] = num;
		index++;
	}

	public void print() {
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// delete() method to delete last element from array
	// My logic
//	public void delete() {
//		if (index == 0) {
//			System.out.println("Array is empty. No elements to delete.");
//		} else {
//			index--;
//			System.out.println("Deleted last element. New size of array is : " + index);
//		}
//	}

	// Sir's logic to delete last element
	public void delete() {
		arr[index - 1] = 0;
		index--;
		System.out.println("Deleted last element. New size of array is : " + index);
	}

	//overridden delete() method to delete specific element
	public void delete(int i) {
			if (index == 0) {
				System.out.println("Array is empty. No elements to delete.");
			} 
			else if (i >= 0 && i < index) {
				for (int j = i; j < index - 1; j++) {
					arr[j] = arr[j + 1];
				}
				index--;
				System.out.println("Element present at index " + i + " is deleted. New size of array is : " + index);
			} 
			else {
				System.out.println("Invalid Index");
			}
	}
	
	//get() method to get the element at specific index
	public int get(int i) {
		int value = 0 ;
		if(i >= 0 && i < index) {
			
		}else {
			
		}
		return value;
	}
	
	//Set method to set or replace the new value at sepcific index
	public void set(int value, int i) {
		if(i >= 0 && i < index) {
			arr[i] = value;
			System.out.println("Value present at index "+i+" is replaced with "+value);
		}else {
			System.out.println("Invalid Index");
		}
	}
	
	//put() method to insert the element at specific element without deleting any element(here, shifting of elements is done)
	public void put(int value, int i) {
		if(i >= 0 && i < index) {
			for(int j = index-1; j>= i; j--) {
				arr[j+1] = arr[j];
			}
			arr[i]=value;
			index++;
		}
		else {
			System.out.println("Invalid Index");
		}
	}
}