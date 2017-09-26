package bai3;

import java.util.Scanner;
public class ElectricBill
{
	public static void main(String[] args) 
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
}
