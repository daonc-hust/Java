package quan_ly_thu_vien;

import java.util.Scanner;

public class Readers 
{
	private int readersCode;
	private String name;
	private String address;
	private String phoneNumber;
	private String readersType;
	
	Scanner scanner = new Scanner(System.in);
	
	public Readers() 
	{
		super();
	}

	public Readers(int readersCode, String name, String address, String phoneNumber, String readersType) 
	{
		super();
		this.readersCode = readersCode;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.readersType = readersType;
	}

	public int getReadersCode() {
		return readersCode;
	}

	public void setReadersCode(int readersCode) {
		this.readersCode = readersCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReadersType() {
		return readersType;
	}

	public void setReadersType(String readersType) {
		this.readersType = readersType;
	}
	
	public void inputReaders()
	{
		System.out.println("Nhap ma ban doc: ");
		setReadersCode(readersCode = scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Nhap ten ban doc: ");
		setName(name = scanner.nextLine());
		
		System.out.println("Nhap dia chi: ");
		setAddress(address = scanner.nextLine());
		
		System.out.println("Nhap so dien thoai: ");
		setPhoneNumber(phoneNumber = scanner.nextLine());
		
		System.out.println("Nhap loai ban doc");
		System.out.println("1.Sinh vien");
		System.out.println("2.Sinh vien cao hoc");
		System.out.println("3.Giao vien");
		
		int choose = scanner.nextInt();
		switch(choose) {
			case 1: {
			readersType = "Sinh vien";
			System.out.println(readersType);
			break;
			}
			
			case 2: {
			readersType = "Sinh vien cao hoc";
			System.out.println(readersType);
			break;
			}
			
			case 3: {
			readersType = "Giao vien";
			System.out.println(readersType);
			break;
			}
		}
	}

	public void showReaders()
	{
		System.out.printf("\t\t%-20d %-20s %-20s %-20s %-20s",readersCode,name,address,phoneNumber,readersType);
	}
}
