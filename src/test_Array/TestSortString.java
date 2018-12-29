package test_Array;

import java.util.Scanner;

//对引用类型的数组进行排序，然后用折半查找法查找特定的引用类型的变量
public class TestSortString {

	public static void main(String[] args) {
		Date days[] = new Date[5];
		Date day = new Date(1996,10,3);
		
		/*for(int i=0;i<days.length;i++) {  //赋值
			days[i] = new Date(1992, 1, i+1);
		}*/
		days[0] = new Date(1992, 1, 27);
		days[1] = new Date(1969, 1, 5);
		days[2] = new Date(1996, 10, 3);
		days[3] = new Date(1968, 11, 1);
		days[4] = new Date(1990, 1, 1);
		System.out.println("排序前的数组："); 
		print(days);  //打印输出赋值后的days数组
		
		chooseSort(days);  //调用选择排序方法
		System.out.println();
		System.out.println("排序后的数组："); 
		print(days);  //打印输出排序后的数组的值
		
		//排好序后，在days[]里查找day
		System.out.println();
		System.out.println(binarySearch(days, day));
	}
	
	//打印输出date对象的值
	private static void print (Date days[]) {
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i].getDate()+" ");  //重写String方法后可直接用System.out.print(days[i]+" ");
		}
	}
	
	
	public static Date[] chooseSort(Date days[]) {
		//选择排序
		int min;
		Date temp;
		for(int i=0;i<days.length;i++) {
			min = i;
			for(int j=i+1;j<days.length;j++) {
				if(days[j].compare(days[min])!=1) {   //为与初始序列区分开，现从大到小排序
					min = j;
				}
			}
			if(min!=i) {
				temp = days[i];
				days[i] = days[min];
				days[min] = temp;
			}
		}
		return days;
	}

	
	//折半查找方法
	public static int binarySearch (Date days[],Date day) {
		if(days.length == 0) return -2;
		int startPos = 0;
		int endPos = days.length-1;
		int mid = (startPos+endPos)/2;
		while(startPos<=endPos) {
			if(day.compare((days[mid]))==0) {
				return mid;
			}
			else if(day.compare((days[mid]))==1) {  //day在mid后
				startPos = mid + 1;
			}
			else if(day.compare((days[mid]))==-1){
				endPos = mid - 1;
			}
			mid = (startPos+endPos)/2;
		}
		return -1;
	}
}

class Date {
	int year,month,day;
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String getDate() {
		return year+"-"+month+"-"+day;
	}
	//或者重写toString方法，输出引用类型的变量
	/*public String toString() {
		return year+"-"+month+"-"+day;
	}
	*/
	public int compare(Date date) {  //引用类型的变量需要用特定的比较方法
		return year > date.year ? 1
			   :year < date.year ? -1
			   :month > date.month ? 1
			   :month < date.month ? -1
			   :day > date.day ? 1
			   :day < date.day ? -1
			   :0;
	}
}
