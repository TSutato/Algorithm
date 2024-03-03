// n個の記号文字*をw個ごとに改行しながら表示(その1)
package chap01;
import java.util.Scanner;

class PrintStars2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n ,w ;
		
		System.out.println("記号文字*をw個ごとに改行しながらn個表示します。");
		System.out.print("nの値：");
		n = stdIn.nextInt();
		System.out.print("wの値：");
		w = stdIn.nextInt();

		for (int i = 0; i < n / w; i++)
		  System.out.println("*".repeat(w)); //w個の"*"の出力を　n/w回行う。
		  int rest = n%w ;
		  if(rest != 0)
			System.out.println("*".repeat(rest));//最後の行はnがwで割ったあまりを変数restに求め、余り分*を出力する。
		  
			
	}

}
//繰り返しは　n/w回。if文の判定は1回。