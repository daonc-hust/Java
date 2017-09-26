package bai1;

import java.util.Scanner;
public class FirstOrderEquation 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		System.out.println("Nhap he so cua pt ax + b = 0");
		System.out.println("Nhap a: ");
		a = scanner.nextInt();
		System.out.println("Nhap b: ");
		b = scanner.nextInt();
		
		if (a==0) {
			if (b==0) {
				System.out.println("PT vo so nghiem");
			} else 
				System.out.println("PT vo nghiem");
		} else
			System.out.println("PT co nghiem duy nhat x = " + (float)-b/a);
	}
}
