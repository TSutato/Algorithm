package chap01;

import java.util.Scanner;

class JudgeABC1 {

	public static void main(String[] args) {
	  Scanner stdIn = new Scanner(System.in);
	  
	  System.out.print("整数を入力して下さい");
	  int n = stdIn.nextInt();
	  
	  if (n == 1)
		System.out.println("A");
	  else if (n == 2)
		System.out.println("B");
	  else
		System.out.println("C");
		
	}

}
