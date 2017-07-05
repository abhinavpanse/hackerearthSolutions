import java.util.Scanner;
class Nobita_and_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();   in.nextLine();
        while( t-- > 0) {
            String str = in.nextLine();
            String[] strWord = str.split(" ");//  \\s = whitespace
            for(int i=strWord.length-1; i >= 0; i--)    System.out.print(strWord[i]+" ");
            System.out.println();
        }
    }
}