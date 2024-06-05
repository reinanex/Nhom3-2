package GiaoDien;

import java.util.Scanner;

import TruuTuong.NhaSach;

public class Dia extends NhaSach {
	String TuaDe;
	long GiaMua;
	int ThoiGian;
	String NhaSanXuat;
	int SoLuongBan;
	long GiaBan;

	public Dia(String b, String d, String s, String tuaDe, long giaMua, int thoiGian, String nhaSanXuat, int soLuongBan,
			long giaBan) {
		super(b, d, s);
		this.TuaDe = tuaDe;
		this.GiaMua = giaMua;
		this.ThoiGian = thoiGian;
		this.NhaSanXuat = nhaSanXuat;
		this.SoLuongBan = soLuongBan;
		this.GiaBan = giaBan;
	}

	public Dia() {
		super();
		this.TuaDe = "";
		this.GiaMua = 0l;
		this.ThoiGian = 0;
		this.NhaSanXuat = "";
		this.SoLuongBan = 0;
		this.GiaBan = 0l;
	}

	@Override
	public void NHAP() {
		super.NHAP();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tựa đề: ");
		this.TuaDe = sc.nextLine();
		System.out.print("Nhập giá mua về: ");
		this.GiaMua = sc.nextLong();
		System.out.print("Nhập thời lượng của ấn phẩm: ");
		this.ThoiGian = sc.nextInt();
		System.out.print("Nhập tên của nhà sản xuất: ");
		this.NhaSanXuat = sc.nextLine();
		System.out.print("Nhập tên số lượng ấn phẩm đã bán ra: ");
		this.SoLuongBan = sc.nextInt();
		System.out.print("Giá bán của ấn phẩm: ");
		this.GiaBan = sc.nextLong();
	}

	@Override
	public String toString() {
		return "[" + super.toString() + "," + this.TuaDe + "," + this.GiaMua + "," + this.ThoiGian + ","
				+ this.NhaSanXuat + "," + this.SoLuongBan + "," + this.GiaBan + "]";
	}

}
