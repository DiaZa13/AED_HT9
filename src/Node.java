/**
 * Node.java
 * Nodes for the RBT
 *
 * @author Diana Zaray Corado Lopez #191025 & Martin Amado Giron #19020
 * @version 25/4/2020
 * 
 * Extraido de: https://github.com/Bibeknam/algorithmtutorprograms/blob/master/data-structures/red-black-trees/RedBlackTree.java
 */

public class Node<E extends Comparable<E>>{
	E data; //holds the info
	Node parent; //pointer to the parent
	Node left; //pointer to the left child
	Node right; //pointer to the right child
	int color; //1 if red, 0 if black
}