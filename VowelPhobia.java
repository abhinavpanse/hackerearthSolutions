import java.util.Scanner;
class VowelPhobia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while(T-- > 0) {
      int num=0;
      
      String str = sc.next();
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
          num++;
        }
      }
      System.out.println(num);
    }
  }
}