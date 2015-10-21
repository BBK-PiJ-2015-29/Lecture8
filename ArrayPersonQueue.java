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
				size++;
				break;
			}
		}
		
	}
	
	public Person retrieve() {
		Person[] temp = new Person[size-1];
		Person head = null;
		if(size = 0) {
			System.out.println("Queue is empty");
			return head;
		}
		if(size > 1){
			head = queue[0];
			for (int i = 1; i < size; i++) {
				temp[i-1] = queue[i];
			}
		}
		
		queue = temp;
		return head;
	}
}

	if(size > 1){
		for (int i = 1; i < size; i++) {
			temp[i-1] = queue[i];
		}
	}