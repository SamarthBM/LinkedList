/****************************************************************
 * Purpose :
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListOperation {

	private INode head;
	private INode tail;

	/*
	 * Method to add a element.
	 * 
	 * @param newNode: element to be added.
	 */
	public INode addNode(INode newNode) {
		if (tail == null)
			tail = newNode;
		if (head == null)
			head = newNode;
		else {
			INode temp = head;
			head = newNode;
			head.setNext(temp);
		}
		return head;
	}
	
	/*Method to display Linked List*/
	public void displayNode() {
		INode current = head;

		System.out.print("Nodes are: ");
		while (current != null) {
			if (current.getNext() != null) {
				System.out.print(current.getKey() + " --> ");
				current = current.getNext();
			} else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}
	}
}