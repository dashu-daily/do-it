package chap01;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		System.out.println("i�� ���� n+1 : " + i + "�Դϴ�.");
	}
}
