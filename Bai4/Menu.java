package bai4;

import java.util.Scanner;
public class Menu 
{
	public void solveFOE()
	{
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		System.out.println("Nhap he so cua pt ax + b = 0");
		System.out.println("Nhap a: ");
		a = scanner.nextInt();
		System.out.println("Nhap b: ");
		b = scanner.nextInt();
		
		if (a==0) {
			if (b==0){
				System.out.println("PT vo so nghiem");
			} else 
				System.out.println("PT vo nghiem");
		} else
			System.out.println("PT co nghiem duy nhat x = " + (float)-b/a);
	}
	
	public void solveQuadratic()
	{
		Scanner scanner = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Nhap he so cho pt ax^2 + bx + c = 0");
		System.out.println("Nhap a: ");
		a = scanner.nextInt();
		System.out.println("Nhap b: ");
		b = scanner.nextInt();
		System.out.println("Nhap c: ");
		c = scanner.nextInt();
		
		if (a==0) {
			if (b==0) {
				if (c==0)
					System.out.println("PT vo so nghiem");
				else 
					System.out.println("PT vo nghiem");
			} else 
				System.out.println("PT co nghiem duy nhat x = " + (float)-c/b);
		} else {
			float delta = b*b - 4*a*c;
			if (delta == 0)
				System.out.println("PT co nghiem duy nhat x = " + (float)-b/2*a);
			else if (delta < 0)
				System.out.println("PT vo nghiem");
			else {
				float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.println("PT co 2 nghiem phan biet x1 = " + x1 + ",x2 = " + x2);
			}	
		}
	}

	public void getElectricBill()
	{
		Scanner scanner = new Scanner(System.in);
		
		int electricityNumber;
		int electricBill;
		System.out.println("Nhap so dien su dung thang nay: ");
		electricityNumber = scanner.nextInt();
		
		if (electricityNumber <= 50) {
			electricBill = 50 * 1000;
			System.out.println("Tien dien = " + electricBill);
		} else {
			electricBill = 50 * 1000 + (electricityNumber - 50) * 1200;
			System.out.println("Tien dien = " + electricBill);
		}
	}
	
	public static void main(String[] args) 
	{
		Menu x = new Menu();
		
		System.out.println("========MENU========");
		System.out.println("1.Giai pt bac 1");
		System.out.println("2.Giai pt bac 2");
		System.out.println("3.Tinh tien dien");
		System.out.println("====================");
		
		Scanner scanner = new Scanner(System.in);
		
		int choose;
		System.out.println("Nhap lua chon cua ban: ");
		choose = scanner.nextInt();
		
		switch (choose) {
		case 1: 
			x.solveFOE();
			break;
		case 2: 
			x.solveQuadratic();
			break;
		case 3: 
			x.getElectricBill();
			break;
		default:
			if (choose < 1 || choose > 3) {
				System.out.println("THOAT");
				break;
			}
		}
	}
}
