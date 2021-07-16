/****************************************************************
 * Purpose : Ability to create Linked List by appending 30 and 70 to 56
 * Node with data 56 is First Created
 * Next Append 30 to 56
 * Finally Append 70 to 30
 * LinkedList Sequence: 56->30->70
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedListOperation linked_list = new LinkedListOperation();

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		//Appending nodes.
		linked_list.appendNode(myFirstNode);
		linked_list.appendNode(mySecondNode);
		linked_list.appendNode(myThirdNode);
		//Displaying the nodes.
		linked_list.displayNode();

	}

}
