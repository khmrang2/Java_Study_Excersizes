package package1;
import java.util.Scanner;

public class Variable {
	
	//Q1 : �ڹ� �� 8���� �⺻�� �������� �����ϰ�, �����÷ΰ� ���� �ʴ� ���� �ʱ�ȭ�ϼ���.(� ���� �˴ϴ�.)
	//����, ������-������, ������-������, ������-�Ǽ���, �Ǽ���-�Ǽ������� �ڵ� ����ȯ�� �Ǵ� ��ʸ� �����ּ���.(�Ǳ⸸ �ϸ� �˴ϴ�.)
	public static void Q1() {
		//���⿡ �ڵ带 �ۼ��ϼ���.
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
		
		//������� ��µǸ� ������ ���� �̴ϴ�.
		System.out.println("Not Problem Found.");
	}
	
	//Q2 : 1���� ���ڸ� �Է��ϸ�, �׿� �����ϴ� ASCII ���ڿ��� ����ϴ� �޼ҵ带 �ۼ��ϼ���.(���� ������ ���� ó���� �ʿ� �����ϴ�.)
	//��Ʈ : char ����ȯ�� �̿��ϼ���.
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
