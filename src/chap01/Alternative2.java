//記号文字＋とーを交互に表示（その2）

package chap01;

import java.util.Scanner;

class Alternative2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("記号文字+と-を交互にn個表示します。");
		System.out.print("nの値:");
		n = stdIn.nextInt();
		for(int i = 0; i < n  / 2; i++) 
		  System.out.print("+-");     
		if ( n % 2 != 0)
		  System.out.print("+");  //nが奇数の場合
		
	} 	

}
