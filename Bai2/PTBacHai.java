package Bai2;

import java.util.Scanner;

public class PTBacHai {

	public static void main(String[] args) {
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

}
