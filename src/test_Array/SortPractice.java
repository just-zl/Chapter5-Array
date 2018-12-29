package test_Array;

//500个人手拉手，围成一圈，数三退一，求最后剩下的一位的最初的序号，个人独立完成用时两小时左右，有待提高
public class SortPractice {

	public static void main(String[] args) {
		int a[] = new int[500];
		int len = a.length;
		int i;
		int count=0; //用来记录数组里元素的值变成-1的个数
		int num = 0; //用来报数
		//初始化数组，使得数组中的值等于其下标的值。则最后那个数组元素的值，序号就是其原来的下标值加1
		for(int m=0;m<len;m++) {
			a[m] = m;
		}

		for(i=0;i<len;i++) {  //当i=len-1时，退出循环 
			if( a[i]!=-1) {   
				/*for(int j=i;j<len-1;j++) {  //遇到能被三整除的序号，数组往前移一位，覆盖其值
					a[j] = a[j+1];
				}
				len--; //长度减一	
				*/
				num++;
				if(num==3) {
					num = 0;
					a[i] = -1;  //遇到数到三的，将其值变成-1
					count++;
				}
			}
		}//该循环退出的时候，num可能有三个值：0，1，2,根据后面的分析发现，这三种值，所需要应对的办法都是一样的
		
		while(len!=count+1) {  //如果数组还有大于1个不为-1的元素，则循环到数组头，继续计数
			for(i=0;i<len;i++) {
				if(a[i]!=-1) {
					num++;
					if(num==3) {
						num = 0;
						a[i] = -1;  //遇到数到三的，将其值变成-1
						count++;
					}
				}
			}
			/*if(num==0) {
				for(i=0;i<len;i++) {
					if(a[i]!=-1) {
						num++;
						if(num==3) {
							num = 0;
							a[i] = -1;  //遇到数到三的，将其值变成-1
							count++;
						}
					}
				}
			}
			if(num==1) {
				for(i=0;i<len;i++) {
					if(a[i]!=-1) {
						num++;
						if(num==3) {
							num = 0;
							a[i] = -1;  //遇到数到三的，将其值变成-1
							count++;
						}
					}
				}
			}
			if(num==2) {
				for(i=0;i<len;i++) {
					if(a[i]!=-1) {
						num++;
						if(num==3) {
							num = 0;
							a[i] = -1;  //遇到数到三的，将其值变成-1
							count++;
						}
					}
				}
			}*/
		}
		
		for(int j=0;j<len;j++) {
			if(a[j]!=-1) {
				int findIt = a[j]+1;
				System.out.println("该元素在数组中的下标是"+a[j]+",即它是第"+findIt+"个数");
			}
		}
	}

}
