package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static int add() {
		int a = 0;
		int b = 0;
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the values of b: ");
		int b=sc.nextInt();
		
		
		System.out.println(a+b);

	}

}
