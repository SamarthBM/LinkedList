/****************************************************************
 * Purpose :To delete 40 from the list.
 * Final sequence:56->30->70
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedListOperation linked_list = new LinkedListOperation();

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		// Appending elements to node.
		linked_list.appendNode(myFirstNode);
		linked_list.appendNode(mySecondNode);
		linked_list.appendNode(myThirdNode);
		// Inserting 40 after 30.
		linked_list.insertAtPosition(40, 2);
		linked_list.displayNode();
		// Deleting 40.
		linked_list.deleteAtPosition(2);
		linked_list.displayNode();
	}

}
