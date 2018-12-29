package test_Array;

//Ã°ÅÝÅÅÐò
public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {3,1,5,32,6,23};
		int temp;
		for(int i=a.length-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
