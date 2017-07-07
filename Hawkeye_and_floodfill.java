import java.util.Scanner;
import java.lang.Math;
class Hawkeye_and_floodfill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] mx = new int[N][N];
		int x = sc.nextInt();
		int y = sc.nextInt();
		int P = sc.nextInt();
		sc.close();
		StringBuilder string = new StringBuilder();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				int max = Math.max(Math.abs( x-i ),Math.abs( y-j ));
				int ch = P-max;
				if(ch>=0)
					string.append( P-max+" " );
				else
					string.append( "0 " );
			}
			string.append("\n");
		}
		System.out.print(string);
	}
}