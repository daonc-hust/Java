package quan_ly_dang_ki_tin_chi;

import java.util.Scanner;

public class Subjects {
	private int subjectsCode;
	private String subjectsTitle;
	private int numberOfLesson;
	private String subjectsType;

	public int getSubjectsCode() {
		return subjectsCode;
	}

	public void setSubjectsCode(int subjectsCode) {
		this.subjectsCode = subjectsCode;
	}

	public String getSubjectsTitle() {
		return subjectsTitle;
	}

	public void setSubjectsTitle(String subjectsTitle) {
		this.subjectsTitle = subjectsTitle;
	}

	public int getNumberOfLesson() {
		return numberOfLesson;
	}

	public void setNumberOfLesson(int numberOfLesson) {
		this.numberOfLesson = numberOfLesson;
	}

	public String getSubjectsType() {
		return subjectsType;
	}

	public void setSubjectsType(String subjectsType) {
		this.subjectsType = subjectsType;
	}

	public void inputSubjects() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ma mon hoc: ");
		setSubjectsCode(scanner.nextInt());

		scanner.nextLine();
		System.out.println("Nhap ten mon hoc: ");
		setSubjectsTitle(scanner.nextLine());

		System.out.println("Nhap so tiet hoc: ");
		setNumberOfLesson(scanner.nextInt());

		System.out.println("Nhap loai mon hoc: ");
		System.out.println("1.Dai cuong");
		System.out.println("2.Co so nganh");
		System.out.println("3.Chuyen nganh bat buoc");
		System.out.println("4.Chuyen nganh tu chon");

		@SuppressWarnings("unused")
		int choose;
		switch (choose = scanner.nextInt()) {
		case 1: {
			subjectsType = "Dai cuong";
			break;
		}
		case 2: {
			subjectsType = "Co so nganh";
			break;
		}
		case 3: {
			subjectsType = "Chuyen nganh bat buoc";
			break;
		}
		case 4: {
			subjectsType = "Chuyen nganh tu chon";
			break;
		}
		}
	}

	public void showSubjects() {
		System.out.printf("\t\t%-20d %-20s %-20d %-20s", subjectsCode, subjectsTitle, numberOfLesson, subjectsType);
	}
}
