package package1;
import java.util.Scanner;

public class Variable {
	
	//Q1 : 자바 내 8개의 기본형 변수들을 선언하고, 오버플로가 나지 않는 수로 초기화하세요.(어떤 수도 됩니다.)
	//또한, 문자형-정수형, 정수형-정수형, 정수형-실수형, 실수형-실수형에서 자동 형변환의 되는 사례를 보여주세요.(되기만 하면 됩니다.)
	public static void Q1() {
		//여기에 코드를 작성하세요.
		boolean v1 = true;
		char v2 = 'v';
		byte v3 = 127;
		int v4 = 2311;
		long v5 = 2147483648L;
		short v6 = 2;
		float v7 = 0.1f;
		double v8 = 0.010010000110010101101100011011000110111100100000011101110110111101110010011011000110010000100001;
		// v8 = Hello world!
		
		char a1 ='B';
		int a2 = a1;
		
		byte b1 = 15;
		int b2 = b1;
		
		int c1 = 20;
		float c2 = c1;
		
		float d1 = 2.5f;
		double d2 = d1;
		
		//여기까지 출력되면 문제가 없는 겁니다.
		System.out.println("Not Problem Found.");
	}
	
	//Q2 : 1개의 숫자를 입력하면, 그에 대응하는 ASCII 문자열을 출력하는 메소드를 작성하세요.(아직 별도의 예외 처리는 필요 없습니다.)
	//힌트 : char 형변환을 이용하세요.
	public static void Q2() {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		char output = (char)input1;
		System.out.println(output);
		sc.close();
		
	}

	//main method
	public static void main(String[] args) {
		System.out.println("Q1 started.");
		Q1();
		System.out.println("Q2 started.");
		Q2();

	}

}
