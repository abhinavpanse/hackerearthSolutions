//UNSOLVED

import java.util.Scanner;

public class Sumit_and_Rohil {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strary = new String[N];
		int ans = 0;
		int sol = 0;
		for(int i = 0; i<N; i++) {
			strary[i] = sc.next();
		}


		for(int i=0;i<N-1;i++) {

			if(strary[i]==null)	continue;

			char[] strchari = strary[i].toCharArray();
			
			for(int j=i+1;j<N;j++) {


				if(strary[j]==null)	continue;
				char[] strcharj = strary[j].toCharArray();

				if(strcharj.length==strchari.length) {

					int diffchar = strchari.length;

					for(int a = 0 ;a<strchari.length;a++) {
			
						for(int b = 0 ; b<strcharj.length;b++) {
			
							if( strchari[a] == strcharj[b] ) {
								strcharj[b] = 0 ;
								diffchar--;
								break;
							}
						}
					}

					if(diffchar==0) {

						strary[j] = "";
					}

				} 
			}
		}
		
		for(int i = 0; i<N;i++) {
			if(strary[i]!="")
				sol++;
			System.out.println(strary[i]);
		}
		System.out.println(sol);
	}
}