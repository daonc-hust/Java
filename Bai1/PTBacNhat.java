package Bai1;

import java.util.Scanner;

public class PTBacNhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap he so cua pt ax + b = 0");
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		
		if(a==0)
		{
			if(b==0){
				System.out.println("PT vo so nghiem");
			}
			else 
				System.out.println("PT vo nghiem");
		}
		else
			System.out.println("PT co nghiem duy nhat x = "+(float)-b/a);
	}

}
