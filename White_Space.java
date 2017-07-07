import java.util.Scanner;
public class White_Space {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//in.close();
		String[] split = str.split(" ");
		System.out.println( (split.length)-1 );
	}
}