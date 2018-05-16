package day02;
/*
 * 算数运算符
 * + - * / % ++ --
 */
public class Operator {
	public static void main(String[] args) {
		//+ 连接作用，将一个字符串和其他数据连接起来
		//+遇到字符串变为连接符
		//+任何类型只要和字符串+，所有数据都变成字符串
		System.out.println("5+5="+5+5);
		//取模运算
		int i=100;
		int j=9;
		System.out.println(i%j);
		//自增运算
		int a=3;
		int b=4;
		System.out.println(++a);
		//System.out.println(a++);
	}

}
