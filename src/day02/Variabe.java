package day02;
/*
 * 定义java中的变量
 * 定义出所有数据类型
 * 四类八种:整型、浮点型、字符型、布尔型
 */
public class Variabe {
	public static void main(String[] args) {
		
	//变量定义三要素：数据类型 、变量名、 数值
		byte b=100;//占有一个字节 ，-128~127
		System.out.println(b);
	//定义短整型 short
	//占有2个字节 -32768~32767
		short c=200;
		System.out.println(c);
	//定义整型 int 占有4个字节 -214783648~2147483647
		int d=50000;
		System.out.println(d);
	//定义长整型  long 占有8个字节 
		long e=2147836481L;
		System.out.println(e);
		
		
	//定义浮点数据  单精度  float  内存中占4个字节
		float f=1.0f;
		System.out.println(f);
	//定义双精度  double 内存中占8个字节
		double g=2.2;//默认为double,不用加后缀
		System.out.println(g);
	//定义字符类型 char 内存中占有两个字节，必须单引号包括，只能写一个字符
		char h='我';
		System.out.println(h);
	//定义布尔类型 boolean 内存中一个字节 只有两个数值 true和false
		boolean i =true;
		System.out.println(i);
	
		
		
		
	
	}

}
