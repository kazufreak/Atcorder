package any;
import java.util.Scanner;;

public class AB085C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();

		int sum = 0;
		boolean count = false;


		for(int i = 0; i <= n;i++) {
			for(int j = 0; j<=n-i;j++) {
				int k = n - i - j;
				if((money - 10000 * i - 5000 * j) / 1000 == k) {
					System.out.println(i+" "+j+" "+k);
					count = true;
					break;
				}
			}
			if(count == true) {
				break;
			}

		}
		if(count == false) {
			System.out.println(-1+" "+-1+" "+-1);
		}
	}

}
