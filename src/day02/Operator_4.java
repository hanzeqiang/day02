package day02;
//�߼������
/*
 * &  ��
   |  ��
   ^  ���  ��ͬΪfalse
   !  ȡ��
   && ��·��(����)��һ����false,һ�߲�����
   || ��·�򣨲�������һ����true,l
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
