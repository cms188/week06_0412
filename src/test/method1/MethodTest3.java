package test.method1;

public class MethodTest3 {
	static int add(int a, int b) {
		int c;
		
		c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		System.out.println("메소드를 이용한 더하기기능입니다. ");
		int a = 1000;
		int b = 2000;
		int c = add(a, b);
		System.out.println(a+" 더하기 "+b+" 는(은) "+add(a,b)+" 입니다. ");
		
		a = 1234;
		b = 5678;
		System.out.println(a+" 더하기 "+b+" 는(은) "+add(a,b)+" 입니다. ");

	}

}
