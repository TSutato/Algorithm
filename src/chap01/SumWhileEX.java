package chap01;

import java.util.Scanner;

class SumWhileEX {
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からnまでの総和を求めます。");
		System.out.print("nの値：");
		int n =stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i<= n) {
			sum += i;
			i++;
		}
		System.out.println("1から" + n + "までの総和は" + sum + "です。");
		System.out.println("なお、While文繰り返し終了時のiの値は" + i + "となります。");
	}

}
