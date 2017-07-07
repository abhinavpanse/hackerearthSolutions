//UNSOLVED
import java.util.Scanner;
public class Acronym {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] strB = new String[a];
		for(int i = 0; i<a; i++) {
			strB[i] = sc.next();
		}
		int b = sc.nextInt();
		String[] strQ = new String[b];
		for(int i = 0; i<b; i++) {
			strQ[i] = sc.next();
		}
		boolean bad = true;
		for(int i = 0; i<b; i++) {
			if(bad == false&&i!=b-1)	System.out.print(".");
			bad = false;
			for(int j = 0; j<a; j++) {
				if( strQ[i].equals(strB[j]) ) {
					bad = true;
					break;
				}
			}
			if(bad==false) {
				System.out.print( Character.toUpperCase((char) strQ[i].charAt(0)));
			}
		}
	}
}