package day02;
//变量定义使用注意事项
public class Variable_2 {

 public static void main(String[] args){
	//1：变量定义后可以不赋值，但是不赋值不能使用
	 int x;
	 x=20;
	 System.out.println(x);
	 //2:变量作用区域限制，变量有效范围只在定义的一对{}内
	 {
		 int i=10;
		 
	 System.out.println(i);
	 }
	 //3:变量不可以重复定义
	 int j=15;
	 double j1=5;
	 System.out.println(j1);
	 
 }
}
