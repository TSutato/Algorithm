//三つの整数値の最大値を求めて表示するプログラム（すべての大小関係に対して確認）
package chap01;


class Max3method {
	
//--- a,b,cの最大値を求めて表示（すべて大小関係に対して確認)
 static int max3(int a,int b,int c) {
	 int max =a;
	 if(b > max) max = b;
	 if(c > max) max = c;
	 
	 return max; //求めた最大値を呼び出し元に返却
 }
	public static void main(String[] args) {
	  System.out.println("max(3,2,1) ="+ max3(3,2,1)); // [A] a>b>c
	  System.out.println("max(3,2,2) ="+ max3(3,2,2)); // [B] a>b=c
	  System.out.println("max(3,1,2) ="+ max3(3,1,2)); // [C] a>c>b
	  System.out.println("max(3,2,3) ="+ max3(3,2,3)); // [D] a=c>b
	  System.out.println("max(2,1,3) ="+ max3(2,1,3)); // [E] c>a>b
	  System.out.println("max(3,2,1) ="+ max3(3,3,2)); // [F] a=b>c
	  System.out.println("max(3,3,3) ="+ max3(3,3,3)); // [G] a=b=c
	  System.out.println("max(2,2,3) ="+ max3(2,2,3)); // [H] a=b<c
	  System.out.println("max(2,3,1) ="+ max3(2,3,1)); // [I] b>a>c
	  System.out.println("max(2,3,2) ="+ max3(2,3,2)); // [J] b>a=c
	  System.out.println("max(1,3,2) ="+ max3(1,3,2)); // [K] b>c>a
	  System.out.println("max(2,3,3) ="+ max3(2,3,3)); // [L] b=c>a
	  System.out.println("max(1,2,3) ="+ max3(1,2,3)); // [M] c>b>a
	  
	}
}
