//キーボードで入力された３つの整数値を読み込み、その中から最大値を求めるシステム
package chap01;


//Sccanerクラスを単純名で利用するための型インポート宣言。
import java.util.Scanner;


class Max03 {

	public static void main(String[] args) {
		//標準入力ストリームであるSystem.inで、キーボードから値や文字を読み込む。
		//変数stdInが、上記のコメントアウト内容の機能を有する。
	  Scanner stdIn = new Scanner(System.in);
	  
	   //nextInt()を利用してキーボードから入力された整数値をint型で取り込む。
	  System.out.println("三つの整数の最大値を求めます。");
	  System.out.print("aの値:"); int a = stdIn.nextInt();
	  System.out.print("bの値:"); int b = stdIn.nextInt();
	  System.out.print("cの値:"); int c = stdIn.nextInt();
	  
	   //最大値の判別、条件分岐を行う
	  int max = a;//はじめに変数を作る際に値を入れる．初期化の役割。また、既に作られている変数に値を入れているため代入の役割を持つ。
	  
	  if(b > max) max = b;
	  if(c > max) max = c;
	  
	  System.out.println("最大値は"+ max + "です。");
	  
	}

}
