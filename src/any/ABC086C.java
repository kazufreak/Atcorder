package any;
import java.util.Scanner;

public class ABC086C {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int[][] cod = new int[n+1][2];
		int[] time = new int[n+1];

		time[0] = 0;
		cod[0][0] = 0;
		cod[0][1] = 0;
		boolean flag = true;

		for(int i =1; i < n+1; i++) {
			time[i] = sc.nextInt();
			cod[i][0] = sc.nextInt();
			cod[i][1] = sc.nextInt();
		}

		for(int i =1 ; i< n+1;i++) {
			int x = cod[i][0] - cod[i-1][0];
			int y = cod[i][1] - cod[i-1][1];
			int t = time[i] - time[i - 1];
			if(t - x - y < 0 || (t - x -y) % 2 == 1) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
