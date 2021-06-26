package doctor;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate (MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay (int day) {
		this.day = day;
	}
	
	public void setMonth (int month) {
		this.month = month;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println(this.day + "." + this.month + "." + this.year);
	}
	
	public static MyDate copyDate(MyDate date) {
		return new MyDate(date.day, date.month, date.year);
	}
}
