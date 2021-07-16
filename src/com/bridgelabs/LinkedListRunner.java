/****************************************************************
 * Purpose :Ability to delete last element.
 * Final Sequence: 56->30
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
		// Displaying the nodes.
		linked_list.displayNode();
		// Removing last element from list.
		linked_list.deleteLastNode();
		linked_list.displayNode();

	}

}
