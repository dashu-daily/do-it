package chap01;

import java.util.Scanner;

public class Q5 {
	static int med3(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) return a;
		else if((a > b && c < b) || (a < b && c > b)) return b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.print("c�� �� : ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
	}
}
