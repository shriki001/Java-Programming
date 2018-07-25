package Class2;

public class Class1 {

	public static void main(String[] s) {
//		MyQueue q = new MyQueue();
//
//		System.out.println(q.capacity());
//		System.out.println(q.size());
//		System.out.println(q.offer(1));
//		System.out.println(q.offer(2));
//		System.out.println(q.offer(3));
//		System.out.println(q.offer(4));
//		System.out.println(q.offer(5));
//		System.out.println(q.poll());
//		System.out.println(q.offer(6));
		 display();

	}

	public static void display() {

		MyStack ms = new MyStack();
		System.out.println(ms.capacity());
		ms.push(1);
		ms.push(2);
		int ans = (int) ms.pop();
		System.out.println(ans);
		ms.push(3);
		System.out.println(ms.size());

	}

}
