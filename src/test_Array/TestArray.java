package test_Array;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		for(int i=0;i<a.length;i++) {
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		
		//ð������
/*		int temp = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}*/
		
		for(int i=a.length-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		//ѡ������
		/*int min,temp;
		for(int i=0;i<a.length-1;i++) {
			min = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			if(min!=i) {  //�����Сֵ���±겻����i����������
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}*/
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
