package Class6;//�����

public class Point {//����� �����

	int x,y;

	public Point() {//����� ����� ������
		x = 1;
		y = 2;
	}
	
	public Point(int a, int b) {//����
		set(a,b);
	}
	
	
	public void printPoint() {//����� ����
		System.out.println("Point. x:" + x + " y:" + y);
	}

	public  void set(int a, int b) {//���� �����
		x=a;
		y=b;
	}

	public double distance(Point r) {//����� ����
		int dx = x - r.x;
		int dy = y - r.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
}
