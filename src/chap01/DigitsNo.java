//本来は正の数字を読み込んで、その桁数を表示するプログラムを作成したかったもの。ーが入らないと数値として読み込まなくなってしまった。
//正しく動くものは正解はDigitsNoEX.javaに記載。

package chap01;

import java.util.Scanner;

class DigitsNo {

	public static void main(String[] args) {
	 Scanner stdIn = new Scanner(System.in);
	 int a= 0; //while文のループを取得した数＝整数桁を得るようにするため。
	
	 
	 System.out.println("入力した桁数を表示します。");
	 
	 
	 while (true) {
	  System.out.print("bの値:");
	  int b = stdIn.nextInt();
	  b = b/10;
	  a++;
	  if(b >= 0) break;
	  System.out.println("0以上の値を入力してください。");
	 } 
	 System.out.println("その数は" + a + "桁です");

	}

}

