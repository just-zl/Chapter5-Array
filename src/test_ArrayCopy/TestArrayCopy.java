package test_ArrayCopy;

//����ĸ���
public class TestArrayCopy {

	public static void main(String[] args) {
		//һά����
		String a[] = {"sun","Microsoft","Oracle","Baidu","Tencent"};
		String b[] = new String[6];
		System.arraycopy(a, 0, b, 0, a.length); //�����Ƶ�����������ʼλ�ã����Ƶ��ĸ����飬���ƹ�������ʼλ�ã����Ƶĳ���
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		//��ά����
		int c[][] = {{1,2},{3,4,5},{6,7}};
		int d[][] = new int[3][];
		System.arraycopy(c, 0, d, 0, c.length);
		d[2][1] = 100;   //c��dָ�������һ�£��ı�dָ���ֵ��c���Ӧ��ֵҲ��ı�
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
