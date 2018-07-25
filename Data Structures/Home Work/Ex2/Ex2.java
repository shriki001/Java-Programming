package Ex2;

import java.util.Stack;

public class Ex2 {
	// ********************** 1 *************************************************************************************

	// ********************* 1.1 *************************************************************************************

	public static boolean balancedParentheses(String expr) {

		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < expr.length(); i++) {
			char ch = expr.charAt(i);
			if (ch == '(')
				s.push(ch);
			else if (ch == ')') {
				if (s.empty())
					return false;
				if (s.pop() != '(')
					return false;
			}
		}
		if (s.empty())
			return true;
		return false;
	}

	// ********************* 1.2 ************************************************************************************

	public static int evaluate(String expr) {
		Stack<Integer> stack = new Stack<Integer>();
		String string = (ToPostfix(expr));
		for (int i = 0; i < string.length(); i++) {
			int ch = string.charAt(i);
			if (ch >= 48 && ch <= 57)
				stack.push(ch - 48);
			else if (ch == '+' || ch == '-' || ch == '*' || ch == '%')
				stack.push(calc(stack.pop(), ch , stack.pop()));
		}
		return stack.pop();
	}
	public static int Operator(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '%':
			return 2;
		}
		return -1;
	}


	public static String ToPostfix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		String postfix = "";
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);
			if (c >= '0' && c <= '9')
				postfix = postfix + c;
			else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					postfix = postfix + (stack.pop());
				if (!stack.isEmpty() && stack.peek() != '(')
					return null;
				else if (!stack.isEmpty())
					stack.pop();
			} else if (c == '+' || c == '-' || c == '*' || c == '%' || c == '(' || c == ')') {
				if (!stack.isEmpty() && Operator(c) <= Operator(stack.peek()))
					postfix = postfix + (stack.pop());
				stack.push(c);
			}
		}
		while (!stack.isEmpty())
			postfix = postfix + (stack.pop());
		return postfix;
	}

	public static int calc(int a, int b, int c) {
		int ans = 0;
		if(b == '+')
			ans = c + a;
		else if(b == '-')
			ans = c - a;
		else if(b == '*')
			ans = c * a;
		else
			ans = c % a;
		return ans;
	}
	
	// ********************* 1.3 ************************************************************************************

	public static String evalExpression(String expr) {
		if (balancedParentheses(expr)) {
			int a = evaluate(expr);
			String s = Integer.toString(a);
			return s;
		} else
			return "error";
	}

	// ********************* 2 *************************************************************************************

	public static int sqrt3(int n, int low, int high) {
		int mid = (high + low) / 2;
		if (mid * mid * mid == n) 
			return mid;
		while (low <= high) {
			mid = (high + low) / 2;
			if (mid * mid * mid > n) 
				return sqrt3(n, low, mid - 1);
			 else 
				return sqrt3(n, mid + 1, high);
		}
		return mid;

	}

	public static int sqrt3(int n) {
		return sqrt3(n, 0, n);
	}

	// ********************* 3 *************************************************************************************

	public static Double middle(LinkedListSingle<Double> list) {
		if (list == null || list.head == null) 
			return null;
		NodeSingle<Double> i = new NodeSingle<Double>(null, null);
		NodeSingle<Double> j = new NodeSingle<Double>(null, null);
		i = list.head;
		j = list.head;
		while (j.next != null) {
			if (i.next != null && j.next.next != null)
				i = i.next;
			if (j.next != null)
				j = j.next;
			if (j.next != null)
				j = j.next;
		}
		return i.data;
	}

	//*************** checking *************************************************************************************
	
	public static void checkMiddle() {
		System.out.println("\n*************** Checking Middle **************");
		LinkedListSingle<Double> list = null;
		System.out.println("middle = " + middle(list));
		list = new LinkedListSingle<>();
		System.out.println("middle = " + middle(list));
		list.add(1.0);
		System.out.println("list: " + list + ", middle = " + middle(list));
		list.add(2.0);
		System.out.println("list: " + list + ", middle = " + middle(list));
		list = new LinkedListSingle<>();
		int n = 5;
		for (int i = 1; i <= n; i++) {
			list.add((double) (i));
		}
		System.out.println("list: " + list + ", middle = " + middle(list));
		System.out.println();
		list.add((double) (n + 1));
		System.out.println("list: " + list + ", middle = " + middle(list));
	}

	public static void checkSqrt3() {
		System.out.println("\n*************** Checking Sqrt3 **************");
		int[] numbers = { 1, 17, 53, 120, 130 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("sqrt3(" + numbers[i] + ") = " + sqrt3(numbers[i]));
		}
	}

	public static void checkEvalExpr() {
		System.out.println("\n*************** Checking EvalExpression **************");
		String[] exp = { "0", "(1+4)", "(((2+3)*3)+(3-1))", "(1+((2+3)*(4*5)))", "((1+5)%4)" };
		String[] errExp = { "1+4)", "((2+3)*3)+(3-1)))", "(1+(2)" };
		for (int i = 0; i < exp.length; i++) {
			System.out.println(exp[i] + " = " + evalExpression(exp[i]));
		}
		System.out.println();
		for (int i = 0; i < errExp.length; i++) {
			System.out.println(errExp[i] + " = " + evalExpression(errExp[i]));
		}
	}

	public static void main(String[] args) {
		 checkEvalExpr();
		 checkMiddle();
		 checkSqrt3();
	}
}