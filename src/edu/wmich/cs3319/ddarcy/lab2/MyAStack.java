package edu.wmich.cs3319.ddarcy.lab2;

/**
CLASS - MyAStack
This class uses an array to implement a stack data structure which holds MyNodes.
 */

public class MyAStack {
	
	//Attributes
	private MyNode stackArray[] = new MyNode[100000];
	private int length;
	
	/**
	 This is the constructor for the MyAQueue class.  It receives no input so all of the variables are set to 0 or null.
	 */
	public MyAStack() {
		super();
		this.length = 0;
	}
	
	/**
	 Pushes node onto stack
	 @param n - number to be in node pushed onto stack
	 */
	public void push(int n) {
		MyNode addedNode = new MyNode(n);
		stackArray[length] = addedNode;
		length++;
	}
	
	/**
	 Removes node from top of stack
	 @return stackArray[length] - length of data structure
	 */
	public MyNode pop() {
		if(length <= 0) {
			System.out.println("Nothing to pop, stack is empty!");
			return null;
		}
		else
			length--;
			return stackArray[length];
	}
	
	/**
	 * Returns the current index
	 * @return length - length of the data structure
	 */
	public int getIndex() {
		return length;
	}
	
	public MyNode getTop() {
		if(length == 0) {
			System.out.println("There is nothing ontop, it is empty!");
		}
		return stackArray[length-1];
	}
	
	/**
	 Takes a decimal number and stores its binary digits in data structure
	 @param n - decimal number to be stored in data structure
	 */
	public void store(int n) {
		if(n == 0) {
			push(n%2);
		}
		else if(n == 1) {
			push(n%2);
		}
		else {
			while(n>=1) {
				push(n%2);
				//System.out.print(n%2);
				n=n/2;	
			}
		}
	}
	
	/**
	 Returns decimal form of stored binary digits
	 @return decimalNum - binary number converted to decimal
	 */
	public int toDecimal() {
		int decimalNum = 0;
		int counter = 0;
		
		while(stackArray[counter] != null) {
			int returnedInt = 0;
			int exponentialInt = (int) Math.pow(2, counter);
			MyNode tempNode = new MyNode();
			tempNode = stackArray[counter];
			returnedInt = tempNode.getMyNum();
			decimalNum = decimalNum + (returnedInt*exponentialInt);	
			counter++;
		}
		return decimalNum;
	
	}
	
}
