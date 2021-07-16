/****************************************************************
 * Purpose : To create methods for Linked List operation.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListOperation {

	INode head = null;
	INode tail = null;

	/*
	 * Method to add a element.
	 * 
	 * @param newNode: element to be added.
	 */
	public void addNode(MyNode newNode) {
		if (tail == null)
			tail = newNode;
		if (head == null)
			head = newNode;
		else {
			INode temp = head;
			head = newNode;
			head.setNext(temp);
		}

	}

	/*
	 * Method to append a element.
	 * 
	 * @param newNode: element to be added.
	 */
	public INode appendNode(MyNode newNode) {
		if (tail == null)
			tail = newNode;
		if (head == null)
			head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		return head;
	}

	/*
	 * Method to insert a element in-between two element.
	 * 
	 * @param myNode: element after which the another element should be added..
	 * 
	 * @param newNode: element to be added.
	 */

	public void insertInMiddle(MyNode myNode, MyNode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	/* Method to delete first node in Linked List */
	public void deleteFirstNode() {
		if (head == null)
			System.out.println("Linked List is empty!");
		else
			head = head.getNext();
	}

	/* Method to delete last element */
	public void deleteLastNode() {
		INode tempNode = head;
		while (tempNode.getNext() != tail) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
		tail = tempNode;
	}

	/* Method to get the position of a element. */
	public void searchElement() {
		if (head == null)
			System.out.println("Linked List is empty");
		else {
			INode tempNode = head;
			int position = 0;
			while (tempNode != null) {
				position++;
				if (tempNode.getKey().equals(30)) {
					System.out.println("Key value 30 is present at position " + position + " in list");
				}
				tempNode = tempNode.getNext();
			}
		}
	}

	/* Method to display Linked List */
	public void displayNode() {
		INode current = head;
		System.out.print("Nodes are: ");
		while (current != null) {
			if (current.getNext() != null) {
				System.out.print(current.getKey() + " -> ");
				current = current.getNext();
			} else {
				System.out.println(current.getKey());
				current = current.getNext();
			}
		}
	}
}