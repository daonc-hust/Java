package Bai3;

import java.util.Scanner;

public class TienDien {

	public static void main(String[] args) {
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

}
