package day02;
/*
 * ++写在变量前面和变量后面有什么区别
 * 符号写在前后无区别
 * 但是变量参与其他运算，就会有区别
 * 
 */

public class Operator_1 {
	public static void main(String[] args) {
		int a=3;
		int b=++a;//先自加再赋值
		System.out.println(a);
		System.out.println(b);
		
	}

}
