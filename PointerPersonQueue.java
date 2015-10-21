public class PointerPersonQueue implements PersonQueue {

	private Person head;
	
	public void insert(Person person) {
		if (this.head == null) {
			this.head = person;
		}
		else {
			this.head.addPerson(person);
		}
		
		
	}
	
	public Person retrieve() {
		Person output = new Person(0, "");
		if (this.head == null) {
			System.out.println("There's no one in the queue!");
			return output;
		}
		else {
			output = this.head;
			this.head = this.head.getNext();
			return output;
		}
	}
	

}
