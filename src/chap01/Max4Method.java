package chap01;

import java.util.Scanner;

class Max4Method {
   //引数a,b,c,dのうち、最大値をまとめてreturnを駆使して変数maxに返却 
	static int max4(int a,int b, int c, int d){
		int max = a;
		if (b > max) max =b;
		if (c > max) max =c;
		if (d > max) max =d;
		
		return max;
			
	}
	
	public static void main(String[] args) {
		
	 Scanner stdIn= new Scanner(System.in);
	 
	 System.out.println("4つの整数の最大値を求めます。");
	 System.out.print("aの値"); int a = stdIn.nextInt(); 
	 System.out.print("bの値"); int b = stdIn.nextInt();
	 System.out.print("cの値"); int c = stdIn.nextInt();
	 System.out.print("dの値"); int d = stdIn.nextInt();
	 
	 int max =max4(a,b,c,d); //a,b,c,dの最大値
	 
	 System.out.println("最大値は"+ max +"です。");
		
	}
}
