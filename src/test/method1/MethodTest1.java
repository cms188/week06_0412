package test.method1;

public class MethodTest1 {
	static void print_head(char c, int num) {	//static 으로 공유공간에 저장 해놔야함
		for(int i = 0; i < num; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {	//static에 저장된 print_head 메소드를 불러와서 사용할 수 있음
		System.out.println("사용자 정의 메소드를 만들었습니다.");
		System.out.println("사용자 정의 메소드를 호출하겠습니다.");
		print_head('◎', 30);
		System.out.println("메소드를 이용한 프로그램입니다.");
		print_head('♧',20);
		System.out.println("메소드를 이용하면 프로그램을 구조화 할 수 있습니다.");
		print_head('☆', 10);

	}

}
