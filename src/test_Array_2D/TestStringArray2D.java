package test_Array_2D;

public class TestStringArray2D {

	public static void main(String[] args) {
		String a[][] = new String[3][]; //3��
		a[0] = new String[1];  //��1�У���һ��Ԫ��
		a[1] = new String[2];  //��2�У�������Ԫ��
		a[2] = new String[3];  //��3�У�������Ԫ��
		//��ֵ
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = "�ҵ�λ���ǣ�"+i+" "+j;
			}
		}
		//���
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
