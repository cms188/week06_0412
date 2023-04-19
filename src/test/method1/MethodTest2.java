package test.method1;

public class MethodTest2 {
	static void add(int a, int b) {
		int c;
		
		c = a+b;
		System.out.println(a+" 더하기 "+b+" 는(은) "+c+" 입니다. ");  //System.out.printf("%d + %d = %d", a, b, c);
	}
	public static void main(String[] args) {
		
		System.out.println("메소드를 이용한 더하기기능입니다. ");
		add(1000, 2000);
		add(1234, 5678);

	}

}
