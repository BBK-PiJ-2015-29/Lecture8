public class ArrayPersonQueue implements PersonQueue {
	private Person[] queue;
	private int size;
	private static int maxQueueSize = 15;
	
	public ArrayPersonQueue() {
		this.queue = new Person[maxQueueSize];
		size = 0;
	}
	
	public void insert(Person person) {
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == null) {
				queue[i] = person;
			}
		}
	}
	
	public Person retrieve() {
		Person[] temp = new Person[queue.length - 1];
		Person head = queue[0];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = queue[i+1];
		}
		queue = temp;
		return head;
	}
}