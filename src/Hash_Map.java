/**
 * Hash_Map.java
 * Hash implementation
 * 
 * @author Diana Zaray Corado Lopez #191025 & Martin Amado Giron #19020
 * @version 23/4/2020
 */

import java.util.*;

public class Hash_Map<K,V> implements iMap<K,V>{
	
	protected Map<K,V> dictionary;
	
	public Hash_Map() {
		dictionary = new HashMap<K,V>();
	}


	/**
	 * add
	 * @pre:
	 * @post: adds new items to the map
	 */

	@Override
	public void add(K k, V v) {
		// TODO Auto-generated method stub
		dictionary.put(k, v);
	}

	/**
	 * getWord
	 * @pre: the map is full
	 * @post: returns the value of the key
	 * @return value: the value of the key that the user gave
	 */
	public V getValue(K key) {
		// TODO Auto-generated method stub
		return dictionary.get(key);
	}

	/**
	 * Empty
	 * @pre:
	 * @post: returns if the map is empty
	 * @return 
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return dictionary.isEmpty();
	}



}
