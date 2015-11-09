/**
 * Class which implements a Map from integer to Strings 
 */
public class SimpleMapImpl implements SimpleMap { 

	private String[] mapArray = new String[1000];

	/**
	 * Puts a new String in the map. 
	 *
	 * If the key is already in the map, nothing is done. 
	 *
	 * @param key The number to be associated with a given string
	 * @param name The String to be associated with the key
	 */
	public void put(int key, String name){ 
		int hashKey = HashUtilities.shortHash(key);
		if (mapArray[hashKey] == null) {
			mapArray[hashKey] = name;
		}
	}

	
	/**
	 * Returns the name associated with that key, 
	 * or null if there is none.
	 *
	 * @param key The position in the map where the desired
	 * String is
	 * @return The Desired String
	 */
	public String get(int key) {
		int hashKey = HashUtilities.shortHash(key);
		if (mapArray[hashKey] == null) {
			return null;
		} else {
			return mapArray[hashKey];
		}
	}
	
	/**
	 * Removes a name from the map. Future calls to get(key) 
	 * will return null for this key unless another
	 * name is added with the same key.
	 *
	 * @param key The position in the map of the String to be
	 * deleted.
	 */
	public void remove(int key) {
		int hashKey = HashUtilities.shortHash(key);
		if (mapArray[hashKey] != null) {
			mapArray[hashKey] = null;
		}
	}

	/**
	 * Returns true if there are no workers in the map, 
	 * false otherwise
	 *
	 * @return true if the map is empty, false otherwise.
	 */
	public boolean isEmpty() {
	
		for (int i = 0; i < 1000; i++)
		if (mapArray[i] != null) {
			return false;
		} 

		return true;
	}
}