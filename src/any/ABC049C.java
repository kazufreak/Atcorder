package any;
import java.util.Scanner;

public class ABC049C {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);;

		String str = sc.nextLine();
		str = str.replaceAll("eraser", "");
		str = str.replaceAll("erase", "");
		str = str.replaceAll("dreamer", "");
		str = str.replaceAll("dream", "");
		
		if(str.isEmpty()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
