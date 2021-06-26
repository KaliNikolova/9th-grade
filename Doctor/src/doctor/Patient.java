package doctor;

public class Patient {
	private MyDate dateOfBirth;
	private String name;
	private int visits;
	
	public Patient() {
		this.dateOfBirth = new MyDate();
		this.name = "Unknown";
		this.visits = 0;
	}
	
	public Patient(MyDate dateOfBirth, String name, int visits) {
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.visits = visits;
	}
	
	public Patient(Patient p) {
		this.dateOfBirth = MyDate.copyDate(p.dateOfBirth);
		this.name = p.name;
		this.visits = p.visits;
	}
	
	public MyDate getDate() {
		return this.dateOfBirth;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getVisits() {
		return this.visits;
	}
	
	public void setDate (MyDate date) {
		this.dateOfBirth = MyDate.copyDate(date);
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setVisits (int visits) {
		this.visits = visits;
	}
	
	public void print() {
		System.out.println("Name: " + this.name + "\nVisits: " + this.visits);
		this.dateOfBirth.print();
	}
}
