package test_Array_2D;

public class TestStringArray2D {

	public static void main(String[] args) {
		String a[][] = new String[3][]; //3行
		a[0] = new String[1];  //第1行，有一个元素
		a[1] = new String[2];  //第2行，有两个元素
		a[2] = new String[3];  //第3行，有三个元素
		//赋值
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = "我的位置是："+i+" "+j;
			}
		}
		//输出
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
