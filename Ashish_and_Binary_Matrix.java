//////////////////UNSOLVED
import java.util.Scanner;
class Ashish_and_Binary_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str ;
            int r = sc.nextInt();
            int c = sc.nextInt();
            char[][] ary = new char[r][c];
            for(int i = 0; i < r; i++) {
                str = sc.next();
                ary[i] = str.toCharArray();
            }
            boolean unique = true;
            char[] str1chr = new char[ c-1 ];
            char[] str2chr = new char[ c-1 ];
            for (int i = 0; i<c && unique==true; i++) {
                for (int j = 0 ; j < r-1 && unique==true ; j++) {
                    int count = 0;
                    for(int l1 = 0,a=0; l1 < c ;l1++,a++){
                        if( l1==i ) {
                            l1++;
                            continue;
                        }
                        str1chr[a]=ary[j][l1];
                    }

                    for (int k = i+1; k < r ; k++) {
                        for(int l2 = 0,a=0; l2 < c ;l2++,a++){
                            if( l2==i ) {
                                l2++;
                                continue;
                            }
                            str2chr[a]=ary[k][l2];
                        }
                        String str1 = String.valueOf(str1chr);
                        String str2 = String.valueOf(str2chr);
                        if( str1.equals(str2) ) {
                            unique = false;
                            System.out.println("false");
                        }
                        else {
                            count++;
                            System.out.println("true");
                        }
                        if(count==r-j-1) {
                            //string is unique now . print Yes . goto next testcast
                            unique = true;
                        }
                    }
                }
            }
            if(unique == false) {
                System.out.println("No");
            }else if (unique == true) {
                System.out.println("Yes");
            }
        }
    }
}