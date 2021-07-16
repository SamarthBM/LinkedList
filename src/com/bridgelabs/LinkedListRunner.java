/****************************************************************
 * Purpose :Ability to insert 30 between 56 and 70
 * Final Sequence: 56->30->70
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public class LinkedListRunner {

	public static void main(String[] args) {
		LinkedListOperation linked_list = new LinkedListOperation();

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		//Inserting 30 in-between 56 and 70.
		linked_list.appendNode(myFirstNode);
		linked_list.appendNode(myThirdNode);
		linked_list.insertInMiddle(myFirstNode,mySecondNode);
		//Displaying the nodes.
		linked_list.displayNode();

	}

}
