/**
 * 
 * Factory.java
 * Defines the implementation to use in the program
 * 
 * @author  Diana Zaray Corado Lopez #191025 & Martin Amado Giron #19020
 * @author Adaptado de Douglas Barrios
 * @version 25/04/2020
 *
 */
class Factory<K,V> {
	
   public iMap<K,V> getMap(String entry) {

	if (entry.equals("1")) {
		//RBT implementation
	}
       
	//else
		return new Hash_Map<K,V>(); //Hash_Map implementation
   }
}

