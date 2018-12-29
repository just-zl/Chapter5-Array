package test_Array;

//用面向对象的方法来实现“数三退一”，借鉴的视频代码。还有一种思想是用数组模拟链表（数组元素的值与下标的关系）

public class SortPractice2 {

	public static void main(String[] args) {
		GameCircle circle1 = new GameCircle(500);
		int num = 0;
		Kids kids = circle1.first;
		while(circle1.count>1) {
			num++;
			if(num==3) {
				num = 0;
				circle1.delete(kids); //为什么这里删除的是kids？  答：没看见这个计数器是干嘛的？没看见油循环吗？
			}
			kids = kids.right;
		}
		System.out.println(circle1.first.id);
	}
}

//孩子类，也就是围圈的人
class Kids {
	int id;  //id里保存的是自己的序号
	Kids left;  //定义孩子左手牵的人
	Kids right;  //定义孩子右手牵的人
}

class GameCircle {
	int count = 0; //多少人围成一个圈
	Kids first;  //圈的第一个人
	Kids last;  //圈的最后一个人
	
	GameCircle(int n) {
		for(int i=0;i<n;i++) {
			add();
		}
	}
	
	//添加成员的方法
	public void add() {
		Kids k = new Kids();
		if(count==0) {  //如果当前圈子里没人
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
	
	//删除成员的方法
	public void delete(Kids k) {
		if(count==0) {
			System.out.println("Error：当前圈里没有成员可删");
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