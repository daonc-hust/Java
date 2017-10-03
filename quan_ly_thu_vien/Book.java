package quan_ly_thu_vien;

import java.util.Scanner;

public class Book 
{
	private int bookCode;
	private String nameOfBook;
	private String author;
	private String specialized;
	private int publishingYear;
	
	Scanner scanner = new Scanner(System.in);
	
	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	
	public void inputBook()
	{
		do{
			System.out.println("Nhap ma sach(5 chu so): ");
			setBookCode(bookCode = scanner.nextInt());
			
			if (bookCode < 10000 || bookCode > 99999) {
				System.out.println("Ma sach khong hop le.Vui long nhap lai!");
			}
		}while (bookCode < 10000 || bookCode > 99999);
		
		scanner.nextLine();
		System.out.println("Nhap ten sach: ");
		setNameOfBook(nameOfBook = scanner.nextLine());
		
		System.out.println("Nhap ten tac gia: ");
		setAuthor(author = scanner.nextLine());
		
		System.out.println("Nhap chuyen nganh: ");
		System.out.println("1.Khoa hoc tu nhien");
		System.out.println("2.Van hoc - nghe thuat");
		System.out.println("3.Dien tu vien thong");
		System.out.println("4.Cong nghe thong tin");
		
		int choose = scanner.nextInt();
		switch(choose)
		{
			case 1: specialized = "KHTN"; 
					System.out.println(specialized);
					break;
			case 2: specialized = "VH-NT";
					System.out.println(specialized);				
					break;
			case 3: specialized = "DTVT";
					System.out.println(specialized);
					break;
			case 4: specialized = "CNTT";
					System.out.println(specialized);
					break;
		}
		
		System.out.println("Nhap nam xuat ban: ");
		setPublishingYear(publishingYear = scanner.nextInt());
	}
	
	public void showBook()
	{
		System.out.printf("\t\t%-20d %-20s %-20s %-20s %-20d",bookCode,nameOfBook,author,specialized,publishingYear);
	}
}
