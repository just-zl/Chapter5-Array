package test_Array;

//递归实现二分法

public class TestSearch2 {
	public static void main(String[] args) {
		int a[] = {1,32,45,67,89,111};
		System.out.println(recursion(a,0,a.length-1,89));
	}
	
	public static int recursion(int a[],int startPos,int endPos,int findIt) {
		if(startPos>endPos || findIt>a[endPos] || findIt<a[startPos]) 
			return -2;
		int mid = (startPos+endPos)/2;
		if(a[mid]==findIt) {
			return mid;
		}
		else if(a[mid]>findIt) 
			return recursion(a, startPos, mid-1, findIt); //直接return
		else 
			return recursion(a, mid+1, endPos, findIt);
	}
}
