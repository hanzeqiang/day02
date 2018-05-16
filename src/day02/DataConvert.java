package day02;
//数据类型转换从小到大自动转换byte-short-int-long-float-fouble
//自动转换；取值范围小的类型，自动转换为取值范围大的类型
//boolean类型不参与类型转换
public class DataConvert {
	public static void main(String[] args){
		//定义double1类型的变量
		double d=1000;//int 自动转成double类型
		System.out.println(d);
		byte b=10;
		int j=b;//byte自动转换为int
		System.out.println("转换后的数据为:"+j);
	}

}
