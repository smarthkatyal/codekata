package com.codekata.practice.kata02;

public class Kata02 {

	public int chop(int key, int[] array) {
		if (array.length == 0)
			return -1;
		return chop(key, array, 0, array.length - 1);
	}

	public int chop(int key, int[] array, int low, int high) {
		if (high >= low) {
			int mid = (low + high) / 2;
			if (key == array[mid])
				return mid;
			else if (key < array[mid])
				return chop(key, array, low, mid - 1);
			else if (key > array[mid])
				return chop(key, array, mid + 1, high);
		}
		return -1;
	}
}
