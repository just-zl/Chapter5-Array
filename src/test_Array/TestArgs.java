package test_Array;

import java.util.Scanner;

public class TestArgs {

	public static void main(String[] args) { //args[]是用来处理运算的引用类型的数组
		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		Scanner sc2 = new Scanner(System.in);
		args[0] = sc1.nextLine();
		args[2] = sc2.nextLine();*/
		if(args.length < 3) {
			System.out.println("请输入正确的格式：\"n1\"+\"op\"+n2\""); //如果要在输出中加双引号，需要加一个\,也就是\"
			System.exit(-1); //-1表示虚拟机非正常退出，0表示正常退出
		}
		
		double b1 = Double.parseDouble(args[0]); //将第一个和第三个 字符串 转换成double类型的数据
		double b2 = Double.parseDouble(args[2]);
		double b = 0; //用来存放最后的结果
		if(args[1].equals("+")) {
			b = b1 + b2;
		}
		else if(args[1].equals("-")) {
			b = b1 - b2;
		}
		else if(args[1].equals("x")) {  //这里用x而不是用*判断乘号
			b = b1 * b2;
		}
		else if(args[1].equals("/")) {
			b = b1 / b2;
		}
		else {
			System.out.println("请输入正确的操作符");
			System.exit(-1);
		}
		System.out.println(b);
	}
}
