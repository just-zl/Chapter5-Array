package test_Array;

//二分法查找有序数列的元素。可以用递归
public class TestSearch {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,8,12,31};
		int i = 8;
		System.out.println(binarySearch(a,i));
	}

	public static int binarySearch(int a[],int i) {
		if(a.length==0) return -1;
		int startPos = 0;
		int endPos = a.length-1;
		int m = (startPos+endPos)/2;
		while(startPos<=endPos) {
			if(i==a[m]) return m; //m为下标
			else if(i>a[m]) {
				startPos = m+1;
			}
			else {
				endPos = m-1;
			}
			m = (startPos+endPos)/2;
		}
		return -1;
	}
}
