// 演習1-9
// 整数bから整数aを引いた値を求める（b > aとなるように読み込む）

package chap01;

import java.util.Scanner;

class Difference {

	public static void main(String[] args) {
	  Scanner stdIn = new Scanner(System.in);
	  int a;
	  int b;
		
	  System.out.print("aの値:");
		
	  a = stdIn.nextInt();
	  
	  while (true) { //無限ループ。bの値がaの値よりも大きくなるまで続ける。　
	    System.out.print("bの値:");
	    b = stdIn.nextInt();
	    if (b > a) break; //bの値の方がaよりも大きくなった時、while文の処理を強制的に終了する。
		System.out.println("aよりも大きな数値を入力せよ！");
	  }

     System.out.println("b-aは"+ (b-a) + "です。");		
	}
}
