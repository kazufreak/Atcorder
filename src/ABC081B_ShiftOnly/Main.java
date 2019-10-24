package ABC081B_ShiftOnly;

import java.util.Scanner;

/*
実行時間制限: 2 sec / メモリ制限: 256 MB
配点 : 200点

問題
黒板に N 個の正の整数 A1,...,AN が書かれています．

すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．

黒板に書かれている整数すべてを，2 で割ったものに置き換える．
すぬけ君は最大で何回操作を行うことができるかを求めてください．

制約
1≤N≤200
1≤Ai≤10^9

出力
すぬけ君は最大で何回操作を行うことができるかを出力せよ
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int bit = 0;
		for(int i = 0; i<a; i++) {
			bit |= sc.nextInt();
		}
		System.out.println(Integer.numberOfLeadingZeros(bit));

	}

}
