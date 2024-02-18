package chap01;

import java.util.Scanner;

class Min4 {
	
	static int min4(int a,int b, int c, int d) {
		
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
		
		
	}
	
	public static void main(String[] args) {
		//標準入力ストリームであるSystem.inで、キーボードから値や文字を読み込む。
	    //変数stdInが、上記のコメントアウト内容の機能を有する。
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("4つの最小値を求めます");
		 //nextInt()を利用してキーボードから入力された整数値をint型で取り込む。
		System.out.print("aの値"); int a = stdIn.nextInt();
		System.out.print("bの値"); int b = stdIn.nextInt();
		System.out.print("cの値"); int c = stdIn.nextInt();
		System.out.print("dの値"); int d = stdIn.nextInt();
		
	    int min = min4(a,b,c,d);
	    
	 System.out.println("最小値は" + min + "です。");
	}
	
	

}
