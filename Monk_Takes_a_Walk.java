import java.util.Scanner;
public class Monk_Takes_a_Walk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			String str = sc.next();
			char[] strchar = str.toCharArray();
			int sol = 0;
			for(int i = 0, len = strchar.length; i<len; i++) {
				char ch = strchar[i];
				if( ch=='U'||ch=='O'||ch=='I'||ch=='E'||ch=='A'||ch=='u'||ch=='o'||ch=='i'||ch=='e'||ch=='a' )
					sol++;
			}
			System.out.println(sol);
		}
	}
}