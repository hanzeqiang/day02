package day02;
/*
 * 数据类型强制转换
 * 强制：数据类型取值范围大的，转为取值范围小的
 * 
 * 数据类型强制转换：被转后的数据类型  变量名=（被转后的数据类型）要转的数据/变量
 * 
 * 强制类型转换，没有要求的时候，不做！
 */
public class DataConvert_1 {
public static void main(String[] args) {
	//double转换为int
	double d=3.14;
	int i=(int)d;
	System.out.println(i);
	byte b=(byte)200;
	System.out.println(b);
			}
}
