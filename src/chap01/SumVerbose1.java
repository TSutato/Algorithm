//1,2,・・・,nの総和を求める
package chap01;

import java.util.Scanner;

class SumVerbose1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1からnまでの総和を求めます。");
		do {
		  System.out.print("nの値:");
		  n = stdIn.nextInt();
		} while (n <= 0);
		
		int sum = 0; //総和
		
		for(int i = 1;  i<=n ; i++) {
			if (i < n)                 //途中
			  System.out.print(i+ "+" );
			else					  //最後
			  System.out.print(i+ "=" );
			sum +=  i;  //forループの間はsumにiを加える。
		}
		
		System.out.print(sum + "となります。");

	}

}

//しかし、繰り返しのたびに条件判定を行うのは明らかに無駄。