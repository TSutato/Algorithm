// 演習1-7
// ガウスの公式によって1, 2, …, nの総和を求める

package chap01;

import java.util.Scanner;

class SumGauss {

	public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);
      
      System.out.println("1からnまでの総和を求めます。");
      System.out.print("nの値：");
      int n = stdIn.nextInt();
      
      //ガウスの公式
      //int sum = (n+1)*(n/2)+(n % 2 == 1 ? (n+1)/ 2 : 0);
      int sum = (n+1)*(n/2);

      if(n%2 == 0) {   	  
          } else {
           sum = (n+1)*(n/2)+(n+1)/2;
          }
  	  System.out.println("1から" + n + "までの総和は" + sum + "となります。" );
	}

}

//(n % 2 == 1 ? (n+1)/ 2 : 0);←今回は丸め誤差。?の左側がtrueなら左側の式を、falseなら右側の式を返す。三項演算子。マイナーなため可読性が落ちる。
//(n%2で１のあまりが出るなら、(n+1)/2で計算。n%2 であまりが出ないなら計算せず、０を加算。
//条件式 ? 式1 : 式2 となる。
//intによる小数点はjavaの仕様上、切り下げるためその対策として？演算子を使っている。


//?演算子を使わない場合。

//    int sum = (n+1)*(n/2);

//      if(n%2 == 0) {
//       } else {
//        sum = (n+1)*(n/2)+(n+1)/2;
//     }
