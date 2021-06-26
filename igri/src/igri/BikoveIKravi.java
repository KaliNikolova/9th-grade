package igri;

import java.util.Random;
import java.util.Scanner;

public class BikoveIKravi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int b1=r.nextInt(10);
		while(b1==0){
			int h=r.nextInt(10);
			b1=h;
		}
		int b2=r.nextInt(10);
		while(b1==b2){
			int h1=r.nextInt(10);
			b2=h1;
		}
		int b3=r.nextInt(10);
		while(b1==b3||b2==b3){
			int h2=r.nextInt(10);
			b3=h2;
		}
		int b4=r.nextInt(10);
		while(b1==b4||b2==b4||b3==b4){
			int h3=r.nextInt(10);
			b4=h3;
		}
		int n=b4+10*b3+100*b2+1000*b1;
		Scanner input=new Scanner(System.in);
		int n1= input.nextInt();
		int bik=0;
		int krava=0;
		int a1=(n1/1000)%10;
		int a2=(n1/100)%10;
		int a3=(n1/10)%10;
		int a4=n1%10;
		if(n1>999&&n1<10000) {
			while(n1!=n) {
				a1=(n1/1000)%10;
				a2=(n1/100)%10;
				a3=(n1/10)%10;
				a4=n1%10;
				bik=0+bik(a1,b1)+bik(a2,b2)+bik(a3,b3)+bik(a4,b4);
				krava=krava(a1,b2,b3,b4)+krava(a2,b1,b3,b4)+krava(a3,b1,b2,b4)+krava(a4,b1,b2,b3);
				
				System.out.println("bikove: "+bik);
				System.out.println("kravi: "+krava);
				int n2= input.nextInt();
				n1=n2;
			}
			System.out.println("pozna chisloto "+n);
		}else {
			System.out.println("greshno yvejdane");
		}
		input.close();
	}
	public static int bik(int cifra1, int cifra2) {
		if(cifra1==cifra2) {
			return 1;
		}
		return 0;
	}
	public static int krava(int a1, int b2, int b3, int b4) {
		if(a1==b2||a1==b3||a1==b4) {
			return 1;
		}
		return 0;
	}
}
