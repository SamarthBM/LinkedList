/****************************************************************
 * Purpose : To create a interface.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

public interface INode<K> {

	void setKey(K key);

	K getKey();

	void setNext(INode<K> next);

	INode<K> getNext();

}
