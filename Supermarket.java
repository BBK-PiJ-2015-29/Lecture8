public class Supermarket {
	
	private ArrayPersonQueue cashier;
	
	public static void main(String[] args) {
		Supermarket tesco = new Supermarket();
		tesco.launch();
	}
	
	public void launch() {
		cashier = new ArrayPersonQueue();
		
		Person p1 = new Person(20, "Brian");
		Person p2 = new Person(30, "Cuthbert");
		Person p3 = new Person(40, "Hyacinth");
		
		addPerson(p1);
		addPerson(p2);
		addPerson(p3);
		
		servePerson();
		servePerson();
		servePerson();
		servePerson();
		
	}
	
	public void addPerson(Person person) {
		this.cashier.insert(person);
	}
	
	public void servePerson() {
		int currentSize = this.cashier.getSize();
		Person served = this.cashier.retrieve();
		
		if(currentSize != 0){
			System.out.println("Name: " + served.getName());
			System.out.println("Age:  " + served.getAge());
		}
		else {
			System.out.println("The queue is empty");
		}
	}
	
}