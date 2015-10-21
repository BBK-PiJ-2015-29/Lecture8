public class Person {
	private int age;
	private String name;
	
	private Person next;
	
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		this.next = null;
	}
	
	public void addPerson(Person person) {
		if (this.next == null) {
			this.next = person;
		}
		else {
			this.next.addPerson(person);
		}
	}
	
	public Person removePerson() {
		return this;
	}
	//setters and getters
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person getNext() {
		return this.next;
	}
	public void setNext(Person next) {
		this.next = next;
	}
}
