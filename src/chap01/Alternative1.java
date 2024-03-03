//記号文字＋とーを交互に表示（その1）

package chap01;

import java.util.Scanner;

class Alternative1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("記号文字+と-を交互にn個表示します。");
		System.out.print("nの値:");
		n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
		 if(i % 2 == 0)
		   System.out.print("+"); //偶数
		 else
	       System.out.print("-"); //奇数
		}
	}
}
