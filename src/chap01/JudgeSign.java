package chap01;

import java.util.Scanner;

class JudgeSign {

	public static void main(String[] args) {
		//標準入力ストリームであるSystem.inで、キーボードから値や文字を読み込む。
		//変数stdInが、上記のコメントアウト内容の機能を有する。
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を記入して下さい⇒");
		 //nextInt()を利用してキーボードから入力された整数値をint型で取り込む。
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("正です。");
		else if(n < 0)
			System.out.println("負です。");
		else
			System.out.println("0です。");
	}

}

