// 2桁の正の整数値(10~99)を読み込む。
package chap01;

import java.util.Scanner;

class TwoDigits {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2桁の整数値を入力してください");
		
		do {
			System.out.print("noの値：");
			no = stdIn.nextInt();
		}   while ( no < 10 || no > 99) ;;//論理和演算子・・・10超過もしくは100未満。

	    System.out.println("変数noの値は" + no + "になりました。");	
	}
}
