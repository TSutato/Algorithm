//本来は正の数字を読み込んで、その桁数を表示するプログラム
package chap01;

import java.util.Scanner;

class DigitsNoEX {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("入力した桁数を表示します。");
		
		int n;
		
		do {
		  System.out.println("正の整数値を入れて下さい。");
		  System.out.print("nの値:");
		  n = stdIn.nextInt();
		} while (n <= 0);
		
		int no = 0; 
		
		while(n > 0) { //10で割る回数＝整数桁を得るようにするため。10で割り続け、１未満になった時にループ処理を終了する。
			n /= 10;
			no++;
		}
       System.out.println("その数は" + no + "桁です");
	}

}

// 作れなかった原因
//正の値を入れるまで入力する処理と、while文のループを取得した数＝整数桁を得る処理を
//切り分けて作らなかったため。