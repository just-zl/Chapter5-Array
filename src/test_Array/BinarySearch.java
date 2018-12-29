package test_Array;

//二分查找法
public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {2,5,11,18,32,51};  //假设是有序的
		int findIt = 3;
		System.out.println(selectSearch(a, findIt));
	}
	
	public static int selectSearch(int a[],int findIt) {
		int startPos = 0;
		int endPos = a.length-1;
		int mid = (startPos+endPos)/2;
		
		while(startPos<=endPos) {
			if(findIt==a[mid]) {
				return mid; //返回其在数组中的下标
			}
			else if(findIt < a[mid]) {
				endPos = mid-1;
			}
			else if(findIt > a[mid]) {
				startPos = mid +1;
			}
			mid = (startPos+endPos)/2;
		}
		return -1;
	}

}
