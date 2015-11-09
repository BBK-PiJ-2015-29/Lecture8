/**
 * Test the simple map
 */
import org.junit.*;
import static org.junit.Assert.*;

public class TestMap {
	private SimpleMap myMap;

	@Before
	public void SetUp() {
		myMap = new SimpleMapImpl();
	}


	@Test
	public void testIsEmptyOnEmptyMap() {
		assertTrue(myMap.isEmpty());
	}

	@Test
	public void testPutAndGetMethod(){
		String name = "Olivier Giroud";
		int key = name.hashCode();
		myMap.put(key, name);

		assertEquals(name, myMap.get(key));
	}

	@Test
	public void testRemoveMethod() {
		String name = "Olivier Giroud";
		int key1 = name.hashCode();
		myMap.put(key1, name);

		name = "Petr Cech";
		int key2 = name.hashCode();
		myMap.put(key2, name);

		name = "Keiran Gibbs";
		int key3 = name.hashCode();
		myMap.put(key3, name);

		name = "Aaron Ramsey";
		int key4 = name.hashCode();
		myMap.put(key4, name);

		assertEquals("Petr Cech", myMap.get(key2));

		assertEquals("Aaron Ramsey", myMap.get(key4));

		myMap.remove(key1);
		assertNull(myMap.get(key1));
	}
}
