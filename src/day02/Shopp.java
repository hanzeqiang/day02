package day02;
/*
 * 实现商品库存清单
 * 步骤:
 * 1、实现打印表头，是固定语句，直接写输出语句
 * 2、表格中间，商品数据，采用变量形式 定义变量和类型，输出所有变量
 * 3、表格尾巴固定
 * 进行计算
 */
public class Shopp {
	public static void main(String[] args) {
		//输出表头
		System.out.println("----------------商城库存清单----------------");
		System.out.println("品牌型号	                        尺寸	  价格	                      库存数");
		//定义表格中的数据标量
		//品牌型号:string 尺寸：double 价格：double 库存：int
		String macBrand="MacBookAir";
		double macSize=13.3;
		double macprice=6988.88;
		int macCount=5;
		System.out.println(macBrand+"    "+macSize+"    "+macprice+"           "+macCount);
	}

}
