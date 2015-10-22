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
		// create new temp array to hold the values of the new shorter array
		Person[] temp;
		if(size > 0) {
			temp = new Person[size-1];
		}
		else {
			temp = new Person[1];
		}
		//initialise a variable to hold the desired person first in the queue
		Person head = new Person(0, "NoOne");
		//check to see if there is anyone in the queue;
		if(size == 0) {
			return head;
		}
		else if(size >= 1){
			//assign the first value to head 
			head = queue[0];
			//populate the temp array with the previous array minus the first 
			for (int i = 1; i < size; i++) {
				temp[i-1] = queue[i];
			}
			size--;
			// repopulate queue array with the temp array
			for (int i = 0; i < size; i++) {
				queue[i] = temp[i];
			}
		}
		// check if the item to be returned is the only item in the list
		
		
		
		return head;
	}
	//getter for size
	public int getSize() {
		return this.size;
	}
}

