/*
 * a. Display the array
b. Reverse the array
c. Replace the nth element from the array and print
d. Find the addition of all elements of the array
e. Find the maximum number from the array
f. Print the average of all the elements from the array.
g. Display the even and odd number from the array separately.
 */

package classwork.tester;

import java.util.Scanner;

import classwork.ArrayDS;
import classwork.ArrayDS.*;

public class ArrayTest {

	public static void main(String[] args) {
		
		
		try(Scanner sc  = new Scanner(System.in)){
				System.out.println("Enter the number of elements you want ");
				int size = sc.nextInt();
				System.out.println("Enter the elements");
				ArrayDS arr = new ArrayDS(size);  
				for(int i =0;i<size;i++) {
					arr.input(sc.nextInt());
				}
				System.out.println("Successfull input");
			boolean exit = false;
			while(!exit) {
				System.out.println("Choose an operation: \n1)Display the array\n2)Reverse the array \n "
						+ "3)Replace the nth element from the array and print\n"
						+ "4)Find the addition of all elements of the array\n "
						+ "5)Find the maximum number from the array \n"
						+ "6)Print the average of all the elements from the array\n "
						+ "7)Display the even and odd number from the array separately\n"
						+ "0)Exit");
				
				switch(sc.nextInt()) {
				case 1:  arr.display();
					break;
				case 2: arr.reverse();
					break;
				case 3: System.out.println("Enter position which you want to replace ");
				   int posi = sc.nextInt();
				   System.out.println("Enter element with which you want to replace ");
				   int ele = sc.nextInt();
					arr.replaceArray(posi, ele);
					break;
				case 4: int sum =  arr.addAllElement();
				System.out.println("Sum of all the elements of this array is : "+sum);
				break;
				case 5:  int max = arr.maxElement();
				System.out.println("Maximum element is: "+max);
					break;
				case 6: int avg = arr.avgElement();
					System.out.println("Average of all the element of array is: "+avg);
					break;
				case 7: arr.evenOdd();
				break;
				case 0: System.out.println("Thank You!!!!");
				         exit = true;
					
				}
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
