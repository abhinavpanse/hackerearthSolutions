import java.util.Scanner;
public class Repeated_K_Times {
	public static void main(String[] args) {
		int[] ary = new int[100003];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			ary[num-1]++;
		}
		int K = sc.nextInt();
		for (int i=0;i<N ;i++ ) {
			if(ary[i]==K) {
				System.out.println(i+1);
				break;
			}
		}
	}
}