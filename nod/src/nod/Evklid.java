/**
 * 
 */
package nod;

/**
 * @author kalina
 *
 */
public class Evklid {
	long time;
	int a;

	/**
	 * 
	 */
	public Evklid(int a, int b) {
		this.a = a;
		time = System.currentTimeMillis();
		int rez = nod(a, b);
		System.out.println("НОД(" + a + "," + b + ") = " + rez);
		System.out.println(time);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Evklid e = new Evklid(45, 15);
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		Evklid e2 = new Evklid(12142, 52222);
		System.out.println(e.nod(16, 56));
	}

	public int nod(int a, int b) {
		while (true) {
			if (a < b) {
				b = b - a;
			}
			if (a > b) {
				a = a - b;
			}
			if (a == b) {
				return a;
			}
		}
	}

}
