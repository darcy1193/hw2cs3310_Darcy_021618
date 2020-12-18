package edu.wmich.cs3319.ddarcy.lab2;

import hw4cs4310_darcy_090518.Person;

/**
CLASS - MyNode
This class creates and manages nodes for a given data structure. The nodes each store an int value
 */

public class MyNode {
	
	//Attributes
	private int myNum = 0;
	private MyNode nextNode;
	private MyNode prevNode;

	/**
	 * Constructor for MyNode class
	 */
	public MyNode() {
		super();
	}

	/**
	 * Used to declare node with number attribute
	 * @param myNum - int to be stored in node
	 */
	public MyNode(int myNum) {
		super();
		this.myNum = myNum;
	}
	
	/**
	 * Sets pointer to next node
	 * @param n - next node
	 */
	public void setNextNode(MyNode n) {		
		nextNode = n;
	}
	
	/**
	 * Returns next node
	 * @return nextNode - next node
	 */
	public MyNode getNextNode() {
		return nextNode;
	}
	
	/**
	 * Returns int from node
	 * @return myNum - int attribute
	 */
	public int getMyNum() {
		return myNum;
	}

	/**
	 * Sets int attribute to be stored in node
	 * @param myNum - number to be stored in node
	 */
	public void setMyNum(int myNum) {
		this.myNum = myNum;
	}
	
	/**
	 * Returns previous node
	 * @return prevNode - previous node
	 */
	public MyNode getPrevNode() {
		return prevNode;
	}

	/**
	 * Sets previous node pointer
	 * @param n - previous node
	 */
	public void setPrevNode(MyNode n) {
		this.prevNode = n;
	}
}






////Quicksort the people by number of friends
//public static void myQuickSort(Person[] tempPeeps, int low, int high) {
//	Person pers = new Person();
//	Person[] peeps  = new Person[high - low];
//	peeps = tempPeeps;
//	pers = peeps[low];
//	if (pers.getNumberId() != 0 && peeps[0].getpopularity() == 0) {
//		System.out.println("returning");
//		return;
//	}
//	if (low >= high)
//		return;
//	// pick the pivot
//	int middle = low + (high - low) / 2;
//	Person pivot = new Person();
//	pivot = peeps[middle];
//
//	// make left < pivot and right > pivot
//	int i = low, j = high;
//	while (i <= j) {
//		while (peeps[i].getpopularity() < pivot.getpopularity()) {
//			System.out.println(peeps[i].getpopularity() + " < " + pivot.getpopularity());
//			i++;
//		}
//		while (peeps[j].getpopularity() > pivot.getpopularity()) {
//			System.out.println(peeps[j].getpopularity() + " > " + pivot.getpopularity());
//			j--;
//		}
//		if (i <= j) {
//			System.out.println(peeps[i].getpopularity() + " <--> " + peeps[j].getpopularity());
//			Person temp = new Person();
//			temp = peeps[i];
//			peeps[i] = peeps[j];
//			peeps[j] = temp;
//			System.out.println(peeps[i].getpopularity() + " ---- " + peeps[j].getpopularity());
//			i++;
//			j--;
//		}
//	}
//	// recursively sort two sub parts
//	if (low < j)
//		myQuickSort(peeps, low, j);
//	if (high > i)
//		myQuickSort(peeps, i, high);
//}
