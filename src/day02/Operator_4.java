package day02;
//逻辑运算符
/*
 * &  与
   |  或
   ^  异或  相同为false
   !  取反
   && 短路与(串联)，一边是false,一边不运行
   || 短路或（并联），一边是true,l
 */
public class Operator_4 {
	public static void main(String[] args) {
		System.out.println(true&true);
		System.out.println(true | true);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(!true);
		System.out.println("................");
		System.out.println(3>4&&2>3);
		System.out.println(3>4|| 3>2);
	}

}
