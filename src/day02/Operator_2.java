package day02;
/*
 *赋值运算符
 *=
 *+= -+ *= /= %=
 */
public class Operator_2 {
	public static void main(String[] args) {
		//= 赋值运算符，将右边的值，赋值给左边的变量
		int i=3;
		i=i+3;
		System.out.println(i);
		//+= 赋值运算 i+=3 i=i+3
		int j=5;
		j+=6;
		System.out.println(j);
		
		
		byte b=1;
		b+=1;//等同于b=(byte)(b+1)
		System.out.println(b);
	}

}
