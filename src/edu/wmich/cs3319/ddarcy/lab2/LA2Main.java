
package edu.wmich.cs3319.ddarcy.lab2;

import java.util.Scanner;

/**
Daniel Darcy
CS 3310
2/15/2018
*/

/**
PROGRAM DESCRIPTION
This program has been made to test different data structures.  The program creates one of each data structure:
array based queue, linked list based queue, array based stack, and linked list based queue.
Next the program takes input from user of how many data structures of each type to create.
The program then finds the different time complexities of each data structure for comparisons.

CLASS - LA2Main
This class runs the show.  It uses methods from all of the other classes to perform 
some tasks and prints desired results.
*/

public class LA2Main {

	public static void main(String[] args) {
		
		//Declare scanner for userInput
		Scanner userInput = new Scanner(System.in);
		int howManyNumbers = 0;
		int count;
		
		//Console output/input
		System.out.println("Enter the amount of random numbers to generate below:");
		howManyNumbers = userInput.nextInt();
		System.out.println("\nn = " + howManyNumbers + "\n");
		System.out.println("---------------------------------------------------------------------------");
		
		//Arrays to store
		count = howManyNumbers;	
		
		//Variables to calculate average time
		long[] llStackTimesArray = new long[howManyNumbers];
		long[] aStackTimesArray = new long[howManyNumbers];
		long[] llQueueTimesArray = new long[howManyNumbers];
		long[] aQueueTimesArray = new long[howManyNumbers];
		long llStackAverage = 0;
		long aStackAverage = 0;
		long llQueueAverage = 0;
		long aQueueAverage = 0;
		
		//Timing variables and randomNum declaration
		long startTime = 0;
		long timeElapsed = 0;
		int randomNumber = 0;
		
		//If n <= 500f
		if(howManyNumbers <= 500) {
			for(int i = 0; i < count; i++) {
				//Generate random number and data structures
				randomNumber=0;
				randomNumber = (int) (Math.random() * 2147483647);
				MyLLStack llStack = new MyLLStack();
				MyAStack aStack = new MyAStack();
				MyLLQueue llQueue = new MyLLQueue();
				MyAQueue aQueue = new MyAQueue();
				
				//MYLLSTACK//////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				llStack.store(randomNumber);
				int tempDecimal = llStack.toDecimal();
				long endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				
				//Console output
				System.out.println("__LL-based Stack__\n");
				System.out.println("Decimal: " + tempDecimal);
				System.out.println("Binary: " + Integer.toBinaryString(tempDecimal));
				//Didnt see toBinaryString in project documentation so used built in fuction^^^^
				System.out.println("Time taken: " + timeElapsed + " nanoseconds\n\n");
				llStackTimesArray[i] = timeElapsed;
				llStackAverage = llStackAverage + timeElapsed;
				
				
				//MYASTACK/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				aStack.store(randomNumber);
				tempDecimal = aStack.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				
				//Console output
				System.out.println("__Array-based Stack__\n");
				System.out.println("Decimal: " + tempDecimal);
				System.out.println("Binary: " + Integer.toBinaryString(tempDecimal));
				System.out.println("Time taken: " + timeElapsed + " nanoseconds\n\n");
				aStackTimesArray[i] = timeElapsed;
				aStackAverage = aStackAverage + timeElapsed;
				
				
				//MYLLQUEUE/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				llQueue.store(randomNumber);
				tempDecimal = llQueue.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				
				//Console output
				System.out.println("__LL-based Queue__\n");
				System.out.println("Decimal: " + tempDecimal);
				System.out.println("Binary: " + Integer.toBinaryString(tempDecimal));
				System.out.println("Time taken: " + timeElapsed + " nanoseconds\n\n");
				llQueueTimesArray[i] = timeElapsed;
				llQueueAverage = llStackAverage + timeElapsed;
				
				
				//MYAQUEUE/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				aQueue.store(randomNumber);
				tempDecimal = aQueue.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				
				//Console output
				System.out.println("__Array-based Queue__\n");
				System.out.println("Decimal: " + tempDecimal);
				System.out.println("Binary: " + Integer.toBinaryString(tempDecimal));
				System.out.println("Time taken: " + timeElapsed + " nanoseconds");
				System.out.println("---------------------------------------------------------------------------" + (i+1));
				aQueueTimesArray[i] = timeElapsed;
				aQueueAverage = aQueueAverage + timeElapsed;
				
			}
			//Calculate averages
			llStackAverage = (long)llStackAverage/howManyNumbers;
			aStackAverage = (long)aStackAverage/howManyNumbers;;
			llQueueAverage = (long)llQueueAverage/howManyNumbers;
			aQueueAverage = (long)aQueueAverage/howManyNumbers;
			
			//Console output
			System.out.println("Average time for LL-based stack: " + llStackAverage + " nanoseconds");
			System.out.println("Average time for Array-based stack: " + aStackAverage + " nanoseconds");
			System.out.println("Average time for LL-based Queue: " + llQueueAverage + " nanoseconds");
			System.out.println("Average time for Array-based Queue: " + aQueueAverage + " nanoseconds");
			System.out.println("---------------------------------------------------------------------------");
		}
		
		//If n > 500
		else {
			for(int i=0; i < howManyNumbers; i++) {
				//Generate random number and data structures
				randomNumber=0;
				randomNumber = (int) (Math.random() * 2147483647);
				int tempDecimal;
				MyLLStack llStack = new MyLLStack();
				MyAStack aStack = new MyAStack();
				MyLLQueue llQueue = new MyLLQueue();
				MyAQueue aQueue = new MyAQueue();
				
				//MYLLSTACK//////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				llStack.store(randomNumber);
				tempDecimal = llStack.toDecimal();
				long endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				llStackTimesArray[i] = timeElapsed;
				llStackAverage = llStackAverage + timeElapsed;
				
				//MYASTACK/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				aStack.store(randomNumber);
				tempDecimal = aStack.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				aStackTimesArray[i] = timeElapsed;
				aStackAverage = aStackAverage + timeElapsed;
				
				//MYLLQUEUE/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				llQueue.store(randomNumber);
				tempDecimal = llQueue.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				llQueueTimesArray[i] = timeElapsed;
				llQueueAverage = llQueueAverage + timeElapsed;
				
				//MYAQUEUE/////////////////////////////////////////////////////////////////////////////////////
				//Store and extract, then figure out how long it took.
				startTime = System.nanoTime();
				aQueue.store(randomNumber);
				tempDecimal = aQueue.toDecimal();
				endTime = System.nanoTime();
				timeElapsed = endTime - startTime;
				aQueueTimesArray[i] = timeElapsed;
				aQueueAverage = aQueueAverage + timeElapsed;
			}
			//Calculate averages
			llStackAverage = (long)llStackAverage/howManyNumbers;
			aStackAverage = (long)aStackAverage/howManyNumbers;;
			llQueueAverage = (long)llQueueAverage/howManyNumbers;
			aQueueAverage = (long)aQueueAverage/howManyNumbers;
			
			//Console output
			System.out.println("Average time for LL-based stack: " + llStackAverage + " nanoseconds");
			System.out.println("Average time for Array-based stack: " + aStackAverage + " nanoseconds");
			System.out.println("Average time for LL-based Queue: " + llQueueAverage + " nanoseconds");
			System.out.println("Average time for Array-based Queue: " + aQueueAverage + " nanoseconds");
			System.out.println("---------------------------------------------------------------------------");	
		}
		//Close userInput Scanner
		userInput.close();
		
		
		
	}
}
