package doctor;

public class Doctor {
	private String name;
	private int patientsRegistered;
	private Patient[] patients;
	
	public Doctor() {
		this.name = "Unknown";
		this.patients = new Patient[100];
		this.patientsRegistered = 0;
	}
	
	public Doctor(String name) {
		this.name = name;
		this.patients = new Patient[100];
		this.patientsRegistered = 0;
	}
	
	public Doctor (Doctor d) {
		this.name = d.name;
		this.patientsRegistered = d.patientsRegistered;
		this.patients = new Patient[100];
		for(int i = 0; i < this.patientsRegistered; i++) {
			this.patients[i] = new Patient(d.patients[i]);
		}
	}
	
	public void registerPatient (Patient p) {
		this.patients[this.patientsRegistered] = new Patient(p);
		this.patientsRegistered++;
	}
	
	public double average () {
		int totalVisits = 0;
		for (int i = 0; i < this.patientsRegistered; i++) {
			totalVisits += this.patients[i].getVisits();
		}
		if(this.patientsRegistered != 0) {
			return (double) (totalVisits) / this.patientsRegistered;
		}
		else {
			return 0;
		}
	}
	
	public void printUpper (int limit) {
		System.out.println("Patients with visits above the limit:");
		for (int i = 0; i < this.patientsRegistered; i++) {
			if(this.patients[i].getVisits() > limit) {
				this.patients[i].print();
			}
		}
	}

}
