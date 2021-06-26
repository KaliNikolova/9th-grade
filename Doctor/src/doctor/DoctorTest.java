package doctor;

import java.util.Scanner;

public class DoctorTest {
	static final int MAX_PATIENTS = 100;
	public static void main (String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter number of patients: ");
			n = sc.nextInt();
		} while (n < 0 || n > MAX_PATIENTS);
		Doctor d1 = new Doctor ("Petrov");
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Patient " + i + " name:");
			String name = sc.nextLine();
			System.out.println("Patient " + i + " day of birth: ");
			int d = sc.nextInt();
			System.out.println("Patient " + i + " month of birth: ");
			int m = sc.nextInt();
			System.out.println("Patient " + i + " year of birth: ");
			int y = sc.nextInt();
			System.out.println("Patient " + i + " number of visits: ");
			int vis = sc.nextInt();
			MyDate date = new MyDate(d, m, y);
			Patient p = new Patient(date, name, vis);
			d1.registerPatient(p);
		}
		System.out.print("Average number of visits: ");
		System.out.println(d1.average());
		sc.close();
	}

}
