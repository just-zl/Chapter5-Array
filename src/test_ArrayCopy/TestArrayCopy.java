package test_ArrayCopy;

//数组的复制
public class TestArrayCopy {

	public static void main(String[] args) {
		//一维数组
		String a[] = {"sun","Microsoft","Oracle","Baidu","Tencent"};
		String b[] = new String[6];
		System.arraycopy(a, 0, b, 0, a.length); //被复制的数组名，起始位置，复制到哪个数组，复制过来的起始位置，复制的长度
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		//二维数组
		int c[][] = {{1,2},{3,4,5},{6,7}};
		int d[][] = new int[3][];
		System.arraycopy(c, 0, d, 0, c.length);
		d[2][1] = 100;   //c和d指向的内容一致，改变d指向的值，c里对应的值也会改变
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
