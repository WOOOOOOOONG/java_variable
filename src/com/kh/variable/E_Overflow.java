package com.kh.variable;

public class E_Overflow {
	public void printVariableSize() {
		//Byte, Short, Integer ...
		//���� java.lang ��Ű�� ������ ���Ե� Ŭ������,
		//import���� �ʰ� ��� ����
		System.out.println("byte�� ũ�� : " + Byte.BYTES + "byte");
		System.out.println("short�� ũ�� : " + Short.BYTES + "byte");
		System.out.println("int�� ũ�� : " + Integer.BYTES + "byte");
		System.out.println("long�� ũ�� : " + Long.BYTES + "byte");
		System.out.println("float�� ũ�� : " + Float.BYTES + "byte");
		System.out.println("double�� ũ�� : " + Double.BYTES + "byte");
		System.out.println("char�� ũ�� : " + Character.BYTES + "byte");
	}
	
	public void overflow() {
		
	}
}
