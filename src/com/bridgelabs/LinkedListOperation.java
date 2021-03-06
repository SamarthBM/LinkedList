/****************************************************************
 * Purpose : To create methods for Linked List operation.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListOperation<K> {

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

	/*
	 * Method to insert a element at particular position.
	 * 
	 * @param key: element to be added.
	 * 
	 * @param position: position of element to be placed.
	 */
	public void insertAtPosition(int key, int position) {
		MyNode newNode = new MyNode(key);
		MyNode nodeAtPreviousIndex = (MyNode) head;
		for (int i = 0; i < position - 1; i++) {
			nodeAtPreviousIndex = (MyNode) nodeAtPreviousIndex.next;
		}
		newNode.next = nodeAtPreviousIndex.next;
		nodeAtPreviousIndex.next = newNode;
	}

	/*
	 * Method to delete a element at particular position.
	 * 
	 * @param position: position of element to be deleted.
	 */
	public void deleteAtPosition(int position) {
		MyNode previousNode = (MyNode) head;
		MyNode currentNode = (MyNode) head;
		for (int i = 0; i < position; i++) {
			previousNode = currentNode;
			currentNode = (MyNode) currentNode.next;
		}
		previousNode.next = currentNode.next;
	}
	/*
	 * Method to sort the linked list.
	 * 
	 * @param element1: element to add and sort.
	 */

	public void insertSortedList(Integer element1) {
		MyNode new_node = new MyNode(element1);
		INode current;

		if (head == null || (Integer) head.getKey() >= (Integer) new_node.getKey()) {
			new_node.next = head;
			head = new_node;
		} else {
			current = head;

			while (current.getNext() != null && (Integer) current.getNext().getKey() < (Integer) new_node.getKey())
				current = current.getNext();

			new_node.next = current.getNext();
			current.setNext(new_node);
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