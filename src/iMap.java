/**
 * iMap.java
 * Map interface 
 * 
 * @author Diana Zaray Corado Lopez #191025 & Martin Amado Giron #19020
 * @version 25/4/2020
 *
 * @param <K>
 * @param <V>
 */
public interface iMap<K,V>{
	
    /**
     * @post returns true iff this map does not contain any entries
     */
    public boolean isEmpty();

    /**
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    public V getValue(K k);

    /**
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    public void add(K k, V v);

}
