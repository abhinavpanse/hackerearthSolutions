import java.util.Scanner;
import java.io.*;
class DNA_Pride {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while( T-- > 0) {
            
            int N = sc.nextInt();
            String str = sc.next();
            int RNA = 0;
            char[] strAry = str.toCharArray();
            //check if RNA
            for(int i = 0; i < N; i++ ) {
                char ch = strAry[i];
                if( !(ch=='A'||ch=='T'||ch=='G'||ch=='C') ) {
                    System.out.println("Error RNA nucleobases found!");
                    RNA = 1;
                    break;
                }
            }
            if(RNA==0){
            //DNA Pride
                for(int i = 0; i < N; i++ ) {
                    char ch = strAry[i];
                    switch(ch) {
                        case 'A': strAry[i]='T'; break;
                        case 'T': strAry[i]='A'; break;
                        case 'G': strAry[i]='C'; break;
                        case 'C': strAry[i]='G'; break;
                    }
                }
                str=String.valueOf(strAry);
                System.out.println(strAry);
            }
            
        }
        
    }
}