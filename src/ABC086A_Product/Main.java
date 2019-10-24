package ABC086A_Product;

import java.util.Scanner;

/*
 実行時間制限: 2 sec / メモリ制限: 256 MB
配点 : 100点

問題
シカのAtCoDeerくんは二つの正整数 a,bを見つけました。aと bの積が偶数か奇数か判定してください。
制約
1≤a,b≤10000
a,bは整数
出力
積が奇数なら Odd と、偶数なら Evenと出力せよ
 */

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a * b % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}


	}

}
