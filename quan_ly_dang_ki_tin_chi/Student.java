package quan_ly_dang_ki_tin_chi;

import java.util.Scanner;

public class Student {
	private int studentCode;
	private String nameOfStudent;
	private String address;
	private long phoneNumber;
	private String classOfStudent;

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getNameOfStudent() {
		return nameOfStudent;
	}

	public void setNameOfStudent(String nameOfStudent) {
		this.nameOfStudent = nameOfStudent;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getClassOfStudent() {
		return classOfStudent;
	}

	public void setClassOfStudent(String classOfStudent) {
		this.classOfStudent = classOfStudent;
	}

	public void inputStudent() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap MSSV: ");
		setStudentCode(scanner.nextInt());

		scanner.nextLine();
		System.out.println("Nhap ten: ");
		setNameOfStudent(scanner.nextLine());

		System.out.println("Nhap dia chi: ");
		setAddress(scanner.nextLine());

		System.out.println("Nhap sdt: ");
		setPhoneNumber(scanner.nextLong());

		scanner.nextLine();
		System.out.println("Nhap lop hoc: ");
		setClassOfStudent(scanner.nextLine());
	}

	public void showStudent() {
		System.out.printf("\t\t%-20d %-20s %-20s %-20d %-20s", studentCode, nameOfStudent, address, phoneNumber,
				classOfStudent);
	}
}
