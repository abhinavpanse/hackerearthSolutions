import java.util.Scanner;
class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strch = str.toCharArray();
        for(int i = 0, n = str.length(); i<n; i++ ) {
            boolean unique = true;
            for(int j = i-1; j>=0; j--) {
                if( strch[i]==strch[j] ) {
                    unique = false;
                    break;
                }
                else if( j==0 ) {
                    unique = true;
                }
            }
            if(unique == true) {
                System.out.print(strch[i]);
            }
        }
    }
}