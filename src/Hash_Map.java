/**
 * @author Diana Zaray Corado Lopez #191025 & Martin Amado Giron #
 * @version 23/4/2020
 */

import java.util.*;

public class Hash_Map<K,V>{
	
	protected Map<K,V> dictionary;
	
	public Hash_Map() {
		dictionary = new HashMap<K,V>();
	}


	/**
	 * add
	 * @pre:
	 * @post: adds new items to the map
	 */
	public void add(K key, V value) {
		// TODO Auto-generated method stub
		dictionary.put(key, value);
		
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
	 * searchWord
	 * @pre: the map is full
	 * @post: returns the key if this is on the map
	 * @return vKey: the key that the user gave
	 */
	public K searchWord(K key) {
		K vkey = null;
		// TODO Auto-generated method stub
		   if (dictionary.containsKey(key)) {
			   vkey = key;
		   }

		return vkey;
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
