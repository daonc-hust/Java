package quan_ly_thu_vien;

import java.util.ArrayList;
import java.util.Scanner;

public class Librarian 
{
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		ArrayList <Book> listBook = new ArrayList<Book>();
		ArrayList <Readers> listReaders = new ArrayList<Readers>();
		
		int []arrayBook = null;
		int numberOfBook;
		int []arrayReaders = null;
		int numberOfReaders;
		int choose;
		
		System.out.print("\t\t===================MENU====================");
		System.out.println("\t\t                                           ");
		System.out.println("\t\t|1. Nhap danh sach dau sach moi            |");
		System.out.println("\t\t|2. Nhap danh sach ban doc                 |");
		System.out.println("\t\t|3. Hien danh sach dau sach moi            |");
		System.out.println("\t\t|4. Hien danh sach ban doc                 |");
		System.out.println("\t\t|5. Thoat chuong trinh                     |");
		System.out.println("\t\t____________________________________________");
		
		do{
			System.out.println("Nhap vao lua chon cua ban: ");
			choose = scanner.nextInt();
			
			switch(choose)
			{
				case 1: {
					System.out.println("Nhap so luong sach: ");
					numberOfBook = scanner.nextInt();
					
					arrayBook = new int [numberOfBook];
					for (int i = 0 ; i < arrayBook.length ; i++)
					{
						System.out.println("Nhap thong tin cuon sach thu " + (i+1));
						Book book = new Book();
						book.inputBook();
						listBook.add(book);
					}
					break;
				}
				
				case 2: {
					System.out.println("Nhap so luong ban doc: ");
					numberOfReaders = scanner.nextInt();
					
					arrayReaders = new int[numberOfReaders];
					for (int i = 0 ; i < arrayReaders.length ; i++)
					{
						System.out.println("Nhap thong tin ban doc thu " + (i+1));
						Readers readers = new Readers();
						readers.inputReaders();
						listReaders.add(readers);
					}
					break;
				}
				
				case 3: {
					System.out.println("\t\t\t\t\t=== DANH SACH DAU SACH MOI ===\n");
					System.out.printf("\t\t%-20s %-20s %-20s %-20s %-10s","Ma sach","Ten sach","Tac gia","Chuyen nganh","Nam xuat ban");
					System.out.println("\n\t\t================================================================================================");
					
					for (int i = 0 ; i < listBook.size() ; i++)
					{
						listBook.get(i).showBook();
						System.out.println();
					}
				
					break;
				}
				
				case 4: {
					System.out.println("\t\t\t\t\t=== DANH SACH BAN DOC ===\n");
					System.out.printf("\t\t%-20s %-20s %-20s %-20s %-10s","Ma ban doc","Ten ban doc","Dia chi","So dien thoai","Loai ban doc");
					System.out.println("\n\t\t================================================================================================");
					
					for (int i = 0 ; i < listReaders.size() ; i++)
					{
						listReaders.get(i).showReaders();
						System.out.println();
					}
					
					break;
				}
				
				case 5: {
					System.out.println("----------> BYE <----------");
					break;
				}
			}
		} while (choose != 5);
	}
}
