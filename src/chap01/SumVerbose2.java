package chap01;

import java.util.Scanner;

class SumVerbose2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1からnまでの総和を求めます。");
		do {
		  System.out.print("nの値:");
		  n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0; //総和
		
		//if文の繰り返し処理は無し。
		for(int i = 1;  i<n ; i++) {
			System.out.print(i + "+");
			sum += i;  //足し続け、nに到達する一つ前（n-1)までの計算分iを加える。
	   }
			System.out.print(n + "=");
            sum += n;
            
            System.out.println(sum + "となります。" );
	
	} 
}
