/**
 * A node in a dynamic singly-linked list of Person (PersonQueue)
 */
public class PersonNode {
	private Person me;
	
	private Person next;
	
	public Person(Person me) {
		this.me = me;
		this.next = null;
	
	// add person to list
	public void addPerson(PersonNode newPerson) {
		if(this.next == null) {
			this.next = newPerson;
		}
		else {
			this.next.addPerson(newPerson);
		}
	} 
	
	// delete person from list(except first person)
	public void deletePerson(PersonNode toBeDeleted) {
		if(this.next.name = toBeDeleted.name) {
			this.next = this.next.next;
		}
		else {
			this.next.deletePerson(toBeDeleted);
		}
	}
	
	// getters and setters
	public Person getMe() {
		return this.me;
	}
	public void setMe(Person me) {
		this.me = me;
	}
	
	public Person getNext() {
		return this.next;
	}
	public void setNext(Person next) {
		this.next = next;
	}
}
