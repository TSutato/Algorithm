//1,2,・・・,nの総和を求める（for文）※Whileとforどちらの繰り返し文の方が処理スピードが早いかは謎。

package chap01;

import java.util.Scanner;

class SumFor {

	public static void main(String[] args) {
	  Scanner stdIn = new Scanner(System.in);
	  
	  System.out.println("1からnまでの総和を求めます。");
	  System.out.print("nの値：");
	  int n = stdIn.nextInt();
	  
	  int sum = 0; //総和
	  
	  for(int i = 1; i<=n ; i++ ) {
		  sum += i ;
	  }
	  System.out.println("1から" + n + "までの総和は" + sum + "となります。" );
	  System.out.println("なお、for文繰り返し終了時の値は" + n + "となります。" );
	}

}
