package test_Array;

import java.util.Scanner;

//���������͵������������Ȼ�����۰���ҷ������ض����������͵ı���
public class TestSortString {

	public static void main(String[] args) {
		Date days[] = new Date[5];
		Date day = new Date(1996,10,3);
		
		/*for(int i=0;i<days.length;i++) {  //��ֵ
			days[i] = new Date(1992, 1, i+1);
		}*/
		days[0] = new Date(1992, 1, 27);
		days[1] = new Date(1969, 1, 5);
		days[2] = new Date(1996, 10, 3);
		days[3] = new Date(1968, 11, 1);
		days[4] = new Date(1990, 1, 1);
		System.out.println("����ǰ�����飺"); 
		print(days);  //��ӡ�����ֵ���days����
		
		chooseSort(days);  //����ѡ�����򷽷�
		System.out.println();
		System.out.println("���������飺"); 
		print(days);  //��ӡ��������������ֵ
		
		//�ź������days[]�����day
		System.out.println();
		System.out.println(binarySearch(days, day));
	}
	
	//��ӡ���date�����ֵ
	private static void print (Date days[]) {
		for(int i=0;i<days.length;i++) {
			System.out.print(days[i].getDate()+" ");  //��дString�������ֱ����System.out.print(days[i]+" ");
		}
	}
	
	
	public static Date[] chooseSort(Date days[]) {
		//ѡ������
		int min;
		Date temp;
		for(int i=0;i<days.length;i++) {
			min = i;
			for(int j=i+1;j<days.length;j++) {
				if(days[j].compare(days[min])!=1) {   //Ϊ���ʼ�������ֿ����ִӴ�С����
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

	
	//�۰���ҷ���
	public static int binarySearch (Date days[],Date day) {
		if(days.length == 0) return -2;
		int startPos = 0;
		int endPos = days.length-1;
		int mid = (startPos+endPos)/2;
		while(startPos<=endPos) {
			if(day.compare((days[mid]))==0) {
				return mid;
			}
			else if(day.compare((days[mid]))==1) {  //day��mid��
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
	//������дtoString����������������͵ı���
	/*public String toString() {
		return year+"-"+month+"-"+day;
	}
	*/
	public int compare(Date date) {  //�������͵ı�����Ҫ���ض��ıȽϷ���
		return year > date.year ? 1
			   :year < date.year ? -1
			   :month > date.month ? 1
			   :month < date.month ? -1
			   :day > date.day ? 1
			   :day < date.day ? -1
			   :0;
	}
}
