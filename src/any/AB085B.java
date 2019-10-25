package any;
import java.util.ArrayList;
import java.util.Scanner;

public class AB085B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> edit = new ArrayList<>();
		for(int i =0;i < n; i++) {
			edit.add(sc.nextInt());
		}
		int[] x = max(edit);
		//ArrayList<Integer> edit = (ArrayList<Integer>) a.clone();
		int kei = x[0];
		int count = 1;
		edit.remove(x[1]);
		
		while(0 < edit.size()) {
			int[] re = max(edit);
			if(re[0] < kei) {
				kei = re[0];
				count++;
				}
			if(edit.size() > 0) {
				edit.remove(re[1]);
			}
			
		}

		System.out.println(count);

	}
	public static int[] max(ArrayList<Integer> list) {
		int[] res = new int[2];
		int max = 0;
		int index = 0;
		for(int i: list) {
			if(max < i) {
				max = i;
				index = list.indexOf(i);
			}
		}
		res[0] = max;
		res[1] = index;
		return res;
	}
}
