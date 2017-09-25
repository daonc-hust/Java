package Bai4;

import java.util.Scanner;

public class Menu {
	
	public void giaiPTBac1()
	{
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
	
	public void giaiPTBac2()
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		System.out.println("Nhap he so cho pt ax^2 + bx + c = 0");
		System.out.println("Nhap a: ");
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		System.out.println("Nhap c: ");
		c = sc.nextInt();
		
		
		if(a==0){
			if(b==0){
				if(c==0)
					System.out.println("PT vo so nghiem");
				else 
					System.out.println("PT vo nghiem");
			}
			else 
				System.out.println("PT co nghiem duy nhat x = "+(float)-c/b);
		}
		else {
			float delta = b*b - 4*a*c;
			if(delta == 0)
				System.out.println("PT co nghiem duy nhat x = "+(float)-b/2*a);
			else if(delta < 0)
				System.out.println("PT vo nghiem");
			else {
				float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.println("PT co 2 nghiem phan biet x1 = "+x1+",x2 = "+x2);
			}
				
		}
	}

	public void tinhTienDien()
	{
		Scanner sc = new Scanner(System.in);
		int soDien;
		int tienDien;
		System.out.println("Nhap so dien su dung thang nay: ");
		soDien = sc.nextInt();
		
		if(soDien <= 50){
			tienDien = 50*1000;
			System.out.println("Tien dien = "+tienDien);
		}
		else {
			tienDien = 50*1000 + (soDien - 50)*1200;
			System.out.println("Tien dien = "+tienDien);
		}
	}
	
	public static void main(String[] args) {
				
		Menu x = new Menu();
		System.out.println("========MENU========");
		System.out.println("1.Giai pt bac 1");
		System.out.println("2.Giai pt bac 2");
		System.out.println("3.Tinh tien dien");
		System.out.println("====================");
		
		Scanner sc = new Scanner(System.in);
		int luaChon;
		System.out.println("Nhap lua chon cua ban: ");
		luaChon = sc.nextInt();
		
		switch(luaChon)
		{
		case 1: x.giaiPTBac1();
		case 2: x.giaiPTBac2();
		case 3: x.tinhTienDien();
		}
		
	}

}
