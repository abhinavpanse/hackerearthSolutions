//logic is correct//learn hashset to solve this//Partially Accepted

import java.util.Scanner;
public class The_Normal_Type {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sol = 0;
		int N = sc.nextInt();
		int[] ary = new int[N];
		for(int i = 0; i<N; i++) {
			ary[i]=sc.nextInt();
		}
		int diffelementsInArray = diffelementNos(ary,0,N);
		//System.out.println("diffelementsInArray="+diffelementsInArray);
		for(int i=0; i<N-1;i++) {
			for(int j=i+diffelementsInArray-1; j<=N; j++) {
				//System.out.print("["+(i+1)+","+(j)+"]= ");
				//for(int k = i; k<j ;k++)
				//	System.out.print( ary[k]+" ");
				//System.out.print("\t\t");
				//System.out.println("diffelements="+diffelementNos(ary,i,j));
				if( diffelementsInArray == diffelementNos( ary,i,j ) ){
					sol++;
				}
			}
		}
		System.out.println(sol);
	}
	static int diffelementNos(int[] ar,int F,int L) {
		int[] arClone = new int[L-F];
		for(int i = 0; i<=L-F-1; i++) {
			arClone[i]=ar[F+i];
		}
		java.util.Arrays.sort(arClone);
		int x=1;
		for(int i = 1; i<L-F; i++) {
			if(arClone[i-1] != arClone[i]){
				x++;
			}
		}
		return x;
	} 
}