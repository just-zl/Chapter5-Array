package test_Array;

import java.util.Scanner;

public class TestArgs {

	public static void main(String[] args) { //args[]����������������������͵�����
		/*Scanner sc1 = new Scanner(System.in);
		System.out.println("�������һ������");
		Scanner sc2 = new Scanner(System.in);
		args[0] = sc1.nextLine();
		args[2] = sc2.nextLine();*/
		if(args.length < 3) {
			System.out.println("��������ȷ�ĸ�ʽ��\"n1\"+\"op\"+n2\""); //���Ҫ������м�˫���ţ���Ҫ��һ��\,Ҳ����\"
			System.exit(-1); //-1��ʾ������������˳���0��ʾ�����˳�
		}
		
		double b1 = Double.parseDouble(args[0]); //����һ���͵����� �ַ��� ת����double���͵�����
		double b2 = Double.parseDouble(args[2]);
		double b = 0; //����������Ľ��
		if(args[1].equals("+")) {
			b = b1 + b2;
		}
		else if(args[1].equals("-")) {
			b = b1 - b2;
		}
		else if(args[1].equals("x")) {  //������x��������*�жϳ˺�
			b = b1 * b2;
		}
		else if(args[1].equals("/")) {
			b = b1 / b2;
		}
		else {
			System.out.println("��������ȷ�Ĳ�����");
			System.exit(-1);
		}
		System.out.println(b);
	}
}
