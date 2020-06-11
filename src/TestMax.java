/* CST8110 - Introduction to Computer Programming
 * Section: 451
 * Semester: 2020S
 * Professor: Piyush Jangam
 * Student ID: 040988707
 * Student Email: gnan0009@algonquinlive.com
 * Assignment 2
 */


import java.util.Scanner;

public class TestMax {
 int inputNum;
 
 public static void main(String[] args) 
	{
	  TestMax TestMax = new TestMax();
	  TestMax.displayNum(TestMax.inputNum());
	}
 
 public int inputNum() {
	 Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
     inputNum = input.nextInt();
	 
	 return inputNum;
 }	 
 
 public void displayNum(int userNum) {
	 
	 int min = Math.min(1,5);
	 int max = Math.max(1,5);
	 
	 if(userNum>min & userNum<max)
	  System.out.println(userNum);
	 else if (userNum<min)
		 System.out.println(min);
	 else 
		System.out.println(max);
	 
	 
 }
	 
 
}
