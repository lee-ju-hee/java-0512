package java01;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {

		int kor1;
		int kor2;
		int kor3;
		int total;
		int menu;
		boolean flag = true;
		double avg;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		Scanner scan = new Scanner(System.in);

		while (flag) {
			
			selectMenu();
			// �޴�
			System.out.println("������������������������");
			System.out.println("��  �޴� ����   ��");
			System.out.println("������������������������");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");
			System.out.print("���� >> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				// �Է�
				System.out.println("������������������������");
				System.out.println("��  ���� �Է�   ��");
				System.out.println("������������������������");

				do {
					System.out.print("����1: ");
					kor1 = scan.nextInt();
					if (kor1 < 0 || 100 < kor1)
						System.out.println("���������� (0~100) ������ϴ�.");
				} while (kor1 < 0 || kor1 > 100);

				do {
					System.out.print("����2: ");
					kor2 = scan.nextInt();
					if (kor2 < 0 || 100 < kor2)
						System.out.println("���������� (0~100) ������ϴ�.");
				} while (kor2 < 0 || kor2 > 100);

				do {
					System.out.print("����3: ");
					kor3 = scan.nextInt();
					if (kor3 < 0 || 100 < kor3)
						System.out.println("���������� (0~100) ������ϴ�.");
				} while (kor3 < 0 || kor3 > 100);

				total = kor1 + kor2 + kor3;
				avg = total / 3;
				System.out.println("������������������������");
				System.out.println("��  ���� ���   ��");
				System.out.println("������������������������");

				for (int i = 0; i < 3; i++)
					System.out.printf("����%d: %d\n", i + 1, kor1);

				System.out.printf("����: %d\n", total);
				System.out.printf("���: %6.2f\n", avg);// ��ü 6�ڸ� �� �Ҽ��� 2��°����

				System.out.println("------------------");
				break;

			case 2:
				// ���
				total = kor1 + kor2 + kor3;
				avg = total / 3;
				System.out.println("������������������������");
				System.out.println("��  ���� ���   ��");
				System.out.println("������������������������");

				for (int i = 0; i < 3; i++)
					System.out.printf("����%d: %d\n", i + 1, kor1);

				System.out.printf("����: %d\n", total);
				System.out.printf("���: %6.2f\n", avg);// ��ü 6�ڸ� �� �Ҽ��� 2��°����

				System.out.println("------------------");
				break;

			case 3:
				flag = false;
				break;
			}
		}
		System.out.println("�����մϴ�.");
	}

	private static void selectMenu() {
		// TODO Auto-generated method stub
		
	}
}
