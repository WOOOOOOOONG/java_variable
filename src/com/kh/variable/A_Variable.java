package com.kh.variable;
/* 
 * �ٸ� ��Ű���� �ȿ��� ���� Ŭ������ ���� �� ����.
 * -> Ŭ�������� ��Ű������� �����ϱ� ������
 *
 */

import java.util.Scanner;

public class A_Variable {
	
	public void printValue() {
		System.out.println("���� ��� ��");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		System.out.println((((100 + 10) * 10) - 10) / 10);
		
		// ������ ���� : � ���� �޸𸮿� ����ϱ� ���� ����
		
		int point = 100;
		int bonus = 10;
		int personCount = 10;
		int fees = 10;
		
		System.out.println();
		System.out.println("���� ��� ��");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println((point + bonus) * personCount);
		
		/* ������ ����ϴ� ����
		 * 
		 * ���� ������ �ΰ� ����ϱ� ����
		 */
	}
	public void declareVariable() {
		// 2. ������
		
		// 2-1. ������
		boolean isTrue;
		byte bNum;
		short sNum;
		int iNum; // �⺻��
		long lNum; // long 8byte
		
		// 2-2. �Ǽ���
		float fNum;
		double dNum; //�⺻��
		
		// 3. ������
		char ch;
		
		// 4. ���ڿ�(������)
		String str;
		
		// ������ �� ����
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 10.8d;
		
		ch = 'a';
		
		str = "ABC"; // �ϳ��� ���ڸ� ���嵵 ����
		
		// 4. ���� ��� ��Ģ
		int number;
		// int number; ���� ������ �� ��.
		int Number;
		// int true; �����  ��.
		int _1;
		int $2;
		//int number#3; '_', '$'�̿��� Ư������ �Ұ���
		String username;
		String userName; //ī�� ǥ������� �ܾ�� �ܾ� �̾��� �� �ڿ��� �빮��
		
		String �̸�; // �ѱ۸��� �ȵǴ� ���� ���� �ֱ� ������ �����ϸ� ����
		
	}
}
