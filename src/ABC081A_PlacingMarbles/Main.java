package ABC081A_PlacingMarbles;

import java.util.Scanner;

public class Main {
	/*
	 実行時間制限: 2 sec / メモリ制限: 256 MB
	配点 : 100点

	問題
	すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。 各マスには 0 か 1 が書かれており、マス i には si が書かれています。
すぬけは 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
	制約
	s1,s2,s3 は 1 あるいは 0

	出力
	答えを出力せよ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.replace("0", "");
		System.out.println(s.length());
	}
}
