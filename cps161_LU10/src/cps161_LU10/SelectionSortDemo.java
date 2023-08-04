package cps161_LU10;

public class SelectionSortDemo {
	// 4, 8, 1, -4, 0, 10
	// -4, 8, 1, 4, 0, 10
	//-4 , 0, 1, 4, 8, 10
	private int[] arr = {4, 8, 1, -4, 0, 10};
	// find the minimum element in unsorted array
	public int findIndexOfMinVal(int startingIndex) {
		int minVal = arr[startingIndex];
		int indexOfMinVal = startingIndex;
		for(int i = startingIndex; i<arr.length; i++) {
			if(arr[i] < minVal) {
				minVal = arr[i];
				indexOfMinVal = i;
			}
		}
		return indexOfMinVal;
	}
	// swap the found minimum element with the "first" element.
	public void swap(int index1, int index2) {
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public void sort() {
		for(int i = 0;i < arr.length; i++) {
			swap(i, findIndexOfMinVal(i));
		}
	}
	public static void main(String[] args) {
		System.out.println("before sore");
		SelectionSortDemo myArr = new SelectionSortDemo();
		for (int eachEle : myArr.arr) {
			System.out.print(eachEle + " ");
		}
		System.out.println();
		myArr.sort();
		System.out.println("after sort");
		for (int eachEle : myArr.arr) {
			System.out.print(eachEle + " ");
		}
	}
}
