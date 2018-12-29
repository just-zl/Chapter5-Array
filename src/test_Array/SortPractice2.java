package test_Array;

//���������ķ�����ʵ�֡�������һ�����������Ƶ���롣����һ��˼����������ģ����������Ԫ�ص�ֵ���±�Ĺ�ϵ��

public class SortPractice2 {

	public static void main(String[] args) {
		GameCircle circle1 = new GameCircle(500);
		int num = 0;
		Kids kids = circle1.first;
		while(circle1.count>1) {
			num++;
			if(num==3) {
				num = 0;
				circle1.delete(kids); //Ϊʲô����ɾ������kids��  ��û��������������Ǹ���ģ�û������ѭ����
			}
			kids = kids.right;
		}
		System.out.println(circle1.first.id);
	}
}

//�����࣬Ҳ����ΧȦ����
class Kids {
	int id;  //id�ﱣ������Լ������
	Kids left;  //���庢������ǣ����
	Kids right;  //���庢������ǣ����
}

class GameCircle {
	int count = 0; //������Χ��һ��Ȧ
	Kids first;  //Ȧ�ĵ�һ����
	Kids last;  //Ȧ�����һ����
	
	GameCircle(int n) {
		for(int i=0;i<n;i++) {
			add();
		}
	}
	
	//��ӳ�Ա�ķ���
	public void add() {
		Kids k = new Kids();
		if(count==0) {  //�����ǰȦ����û��
			first = k;
			last = k;
			k.left = k;
			k.right = k;
			k.id = count++;
		}
		else{
			first.left = k;
			k.right = first;
			last.right = k;
			k.left = last;
			last = k;
			k.id = count++;
		}
	}
	
	//ɾ����Ա�ķ���
	public void delete(Kids k) {
		if(count==0) {
			System.out.println("Error����ǰȦ��û�г�Ա��ɾ");
		}
		else if(count==1) {
			first = last = null;
		}
		else {
			k.left.right = k.right;
			k.right.left = k.left;
			if(k==first) {
				first = k.right;
			}
			else if(k==last) {
				last = k.left;
			}
		}
		count--;
	}
}