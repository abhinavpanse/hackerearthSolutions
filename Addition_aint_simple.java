import java.util.Scanner;
public class Addition_aint_simple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-->0) {
			String str = sc.next();
			for(int i = 0 , len = str.length(); i<len; i++) {
				int ascii1 = str.charAt(i)-96;
				int ascii2 = str.charAt(len-1-i)-96;
				int asciians = ascii1+ascii2;
				if(asciians>26) {
					asciians-=26;
				}
				int ch = (char) (asciians+96);
				System.out.print( (char)ch );
			}
			System.out.println();
		}
	}
}