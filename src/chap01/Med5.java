package chap01;

import java.util.Scanner;

public class Med5 {
	
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		 else if (b > c)
			return b;
		 return c;
	}
	
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三つの整数の中央値を求めます。");
		System.out.print("aの値"); int a = stdIn.nextInt();
		System.out.print("bの値"); int b = stdIn.nextInt();
		System.out.print("cの値"); int c = stdIn.nextInt();
	
		System.out.print("中央値は" + med3(a,b,c) +"です");

	}

}
