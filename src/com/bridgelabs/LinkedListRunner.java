/****************************************************************
 * Purpose : Ability to create Linked List by adding 30 and 56 to 70
 * Node with data 70 is First Created
 * Next 30 is added to 70
 * Finally 56 is added to 30
 * LinkedList Sequence: 56->30->70
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedListOperation linked_list = new LinkedListOperation();

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		//Adding nodes.
		linked_list.addNode(myFirstNode);
		linked_list.addNode(mySecondNode);
		linked_list.addNode(myThirdNode);
		//Displaying the nodes.
		linked_list.displayNode();

	}

}
