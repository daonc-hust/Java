package quan_ly_dang_ki_tin_chi;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUpBoard {
	@SuppressWarnings("unused")
	private Subjects subjects;
	@SuppressWarnings("unused")
	private Student student;

	Scanner scanner = new Scanner(System.in);

	ArrayList<Subjects> listSubjects = new ArrayList<Subjects>();
	ArrayList<Student> listStudent = new ArrayList<Student>();

	public void inputForSubjects() {

		int[] arraySubjects;
		int numberOfSubjects;

		System.out.println("Nhap so luong mon hoc: ");
		numberOfSubjects = scanner.nextInt();

		arraySubjects = new int[numberOfSubjects];
		for (int i = 0; i < arraySubjects.length; i++) {
			System.out.println("Nhap thong tin mon hoc thu " + (i + 1));

			Subjects subjects = new Subjects();
			subjects.inputSubjects();
			listSubjects.add(subjects);
		}
	}

	public void showForSubjects() {
		System.out.println("\t\t\t\t\t=== DANH SACH MON HOC ===\n");
		System.out.printf("\t\t%-20s %-20s %-20s %-20s", "Ma mon hoc", "Mon hoc", "So tiet hoc", "Loai mon hoc");
		System.out.println("\n\t\t================================================================================");

		for (int i = 0; i < listSubjects.size(); i++) {
			listSubjects.get(i).showSubjects();
			System.out.println();
		}
	}

	public void inputForStudent() {

		int[] arrayStudent;
		int numberOfStudent;

		System.out.println("Nhap so luong sinh vien: ");
		numberOfStudent = scanner.nextInt();

		arrayStudent = new int[numberOfStudent];
		for (int i = 0; i < arrayStudent.length; i++) {
			System.out.println("Nhap thong tin mon hoc thu " + (i + 1));

			Student student = new Student();
			student.inputStudent();
			listStudent.add(student);
		}
	}

	public void showForStudent() {
		System.out.println("\t\t\t\t\t=========== DANH SACH SINH VIEN ===========\n");
		System.out.printf("\t\t%-20s %-20s %-20s %-20s %-20s", "MSSV", "Ten", "Dia chi", "SDT", "Lop hoc");
		System.out.println(
				"\n\t\t=========================================================================================");

		for (int i = 0; i < listStudent.size(); i++) {
			listStudent.get(i).showStudent();
			System.out.println();
		}
	}

	// Dang ky tin chi
	public void creditRegistration(SignUpBoard x) {
		int number;
		do {
			System.out.println("Nhap so luong mon hoc can dang ky: ");
			number = scanner.nextInt();
			if (number < 0 || number > 3) {
				System.out.println("So mon hoc dang ky khong vuot qua 3.Vui long nhap lai!");
			}
		} while (number < 0 || number > 3);

		x.showForSubjects();
		for (int i = 0; i < number; i++) {
			System.out.println("Chon ma mon hoc thu " + (i + 1));
			subjects = new Subjects();
			x.subjects.setSubjectsCode(scanner.nextInt());
		}
		System.out.println("DANG KY THANH CONG!");
	}

	public void swap(Object a, Object b) {
		Object temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SignUpBoard x = new SignUpBoard();

		System.out.println("\t\t\t\t\t================== MENU ==================");
		System.out.println("\t\t\t\t\t|1. Nhap danh sach mon hoc     		  |");
		System.out.println("\t\t\t\t\t|2. Hien thi danh sach mon hoc     	  |");
		System.out.println("\t\t\t\t\t|3. Nhap danh sach sinh vien     	  |");
		System.out.println("\t\t\t\t\t|4. Hien thi danh sach sinh vien          |");
		System.out.println("\t\t\t\t\t|5. Dang ky tin chi            		  |");
		System.out.println("\t\t\t\t\t|6. Thoat                                 |");

		int choose;
		do {
			System.out.println("Nhap lua chon cua ban: ");
			choose = scanner.nextInt();

			if (choose <= 0 || choose > 6) {
				System.out.println("Nhap lai lua chon!");
			}
			switch (choose) {
			case 1: {
				x.inputForSubjects();
				break;
			}

			case 2: {
				x.showForSubjects();
				break;
			}

			case 3: {
				x.inputForStudent();
				break;
			}

			case 4: {
				x.showForStudent();
				break;
			}

			case 5: {
				x.creditRegistration(x);
				break;
			}

			case 6: {
				System.out.println("-------- BYE --------");
				break;
			}
			}
		} while (choose != 6);
	}
}
