package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util ��Ű������ �����ϴ� Scanner Ŭ������ �̿���
	// Ű���� �Է� �׽�Ʈ
	
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ� : ");
//		String name = sc.next();
//		-> ����ڰ� �Է��� �� �� ���� ���������� ���� �о����
		String name = sc.nextLine();
//		-> ����ڰ� �Է��� �� �ٿ� �ִ� ��� ���� �о����
//		-> ������ ���Ե� ������ ������ nextLine(). �����ϸ� nextLine() ���� �ɵ�.
		
		System.out.print("����� ���̴� ����Դϱ� :  ");
		int age = sc.nextInt();
//		-> ����ڰ� �Է��� ������ ���� �� �о����
		
		System.out.print("����� Ű�� ���Դϱ�"
				+ "(�Ҽ��� ù° �ڸ����� �Է��Ͻÿ�.) : ");
		double height = sc.nextDouble();
		
//		����ڰ� �Է��� ������ ���� name, age, height ��� ������ ������� ����ؼ� Ȯ��
		System.out.println(name + "���� " + age + "�� �̸�, Ű��" + height + "cm�Դϴ�.");;
		
		sc.close();
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt(); // ���̿� enter���� �Է�
		sc.nextLine();
		
		System.out.println("�ּ� : ");
		String address = sc.nextLine(); // ���ۿ� �̹� �ִ� enter�� ���� �ٷ� ����
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "����" + age + "�� �̸�, ��� ���� " + address
				+ "�̰�, Ű�� " + height + "cm�Դϴ�.");
	}
	
	public void inputScanner3() {
		// ���� ����
		String name;
		char gender;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		gender = sc.nextLine().charAt(0);
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height);
		
		sc.close();
	}
}
