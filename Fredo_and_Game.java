import java.util.Scanner;
public class Fredo_and_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int A,N,j;
			A = sc.nextInt();
			N = sc.nextInt();
			boolean end = false;
			int[] ary = new int[N];
			for (int i=0; i<N; i++) {
				ary[i] = sc.nextInt();
			}
			for (int i=0; i<N; i++ ) {
				if(ary[i]==1) {
					A+=2;
					if(i>=N-1) {
						System.out.println("Yes "+A);
						end=true;
						break;
					}
				}
				else if(ary[i]==0 && i!=N-1 ) {
					A--;
					if(A==0) {
						System.out.println("No "+(i+1));
						end = true;
						break;
					}
				}
				else if(ary[i]==0 && i == N-1) {
					A--;
					if(A==0){
						System.out.println("Yes "+(A));
						end=true;
						break;
					}
				}
			}
			if(end==false) {
				System.out.println("Yes "+A);
				end=true;
			}
		} 
	}
}