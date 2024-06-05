package TruuTuong;

import java.util.Scanner;

public abstract class NhaSach {
	String Bang;
	String Dia;
	String Sach;

	public NhaSach() {
		this.Bang = " ";
		this.Dia = " ";
		this.Sach = " ";
	}

	public NhaSach(String b, String d, String s) {
		this.Bang = b;
		this.Dia = d;
		this.Sach = s;
	}

	public void NHAP() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhập tên Băng: ");
		this.Bang = scn.nextLine();
		System.out.println("Nhập tên Đĩa: ");
		this.Dia = scn.nextLine();
		System.out.println("Nhập tên Sách: ");
		this.Sach = scn.nextLine();
	}


	@Override
	public String toString() {
		return this.Bang + "," + this.Dia + "," + this.Sach;
	}

//	abstract float TongTriGiaban();


}