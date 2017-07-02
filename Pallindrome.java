import java.util.Scanner;
class Pallindrome {

    static boolean check(String str) {
        for(int i = 0, N = str.length(); i < N/2 ; i++ ) {
            if( str.charAt(i) != str.charAt(N-i-1) )
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while( T-- > 0 ) {
            String str = sc.next();
            if(str.equals("") ||str.length()==1) System.out.println("YES");
            else {

                if( Pallindrome.check(str)==true )
                    System.out.println("YES");
                else
                    System.out.println("NO");

            }
        }
    }
}