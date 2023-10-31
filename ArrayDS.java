/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the array.
2. Initialize the array using user input.
3. Create the functions for the following and call them using a menu based program.
a. Display the array
b. Reverse the array
c. Replace the nth element from the array and print
d. Find the addition of all elements of the array
e. Find the maximum number from the array
f. Print the average of all the elements from the array.
g. Display the even and odd number from the array separately.
 */

package classwork;

import java.sql.Array;

public class ArrayDS {
		
	 private int[] arr;
	 private int size;
	private int top;
	 
	 public ArrayDS(int size) {
		 this.size = size;
		 arr = new int[size];
		 this.top = 0;
	 }
	public boolean isEmpty() {
		return (top<=0);
	}
	 
	 public void input(int ele) throws Exception {
		 if(isFull()) {
			 throw new Exception("Array out of bound");
		 }else {
			 arr[top] = ele;
			 top++;
		 }
	 }
	 
	 private boolean isFull() {
		 return top==arr.length;	
		}
	 public int arrSize() {
		 return top;
	 }
	public void display() {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 }
	
	public void reverse() {
		int i=0;
		int j= arrSize()-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
			display();
		
	}
		public void replaceArray(int posi,int ele) {
			for(int i=0;i<arrSize();i++) {
				if(arr[i] == arr[posi]) {
					arr[posi] = ele;
				}
				System.out.print(arr[i]+" ");
				
			}
			System.out.println();
		
		}
		public int addAllElement() {
			int sum = 0;
			for(int i=0;i<arrSize();i++) {
				sum+=arr[i];
			}
			return sum;
			
		}
		public int maxElement() {
			int max = Integer.MIN_VALUE;
			for(int i=0;i<arrSize();i++) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			return max;
		}
		public int avgElement() {
			int sum = addAllElement();
			int avg = sum/arrSize();
			return avg;
		}
//		public void evenOdd() {
//			int[] even = new int[size];
//			int[] odd = new int[size];
//			for(int i=0;i<arrSize();i++) {
//				if(arr[i]%2==0) {
//					even[i] = arr[i];
//				}
//				else {
//					odd[i] = arr[i];
//				}
//			}
//			for(int i=0;i<even.length;i++) {
//			System.out.print(even[i]+ " ");
//			}
//			System.out.println();
//			for(int i=0;i<odd.length;i++) {
//				System.out.print(odd[i]+" ");
//			}
//			System.out.println();
//		}
		public void evenOdd() {
			System.out.println("Even elements are : ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			System.out.println("Odd elements are : ");
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			
		}
}
