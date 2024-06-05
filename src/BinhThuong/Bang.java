package BinhThuong;

import java.util.Scanner;

import TruuTuong.NhaSach;

public class Bang extends NhaSach {
	String Tuade;
	long Giamua;
	long Giaban;
	private int Time;
	int Soluongdaban;
	private String Nhasanxuat;

	public Bang(String b, String d, String s, String Tuade, long giamua, long giaban, int time, int soluongdaban,
			String nhasanxuat) {
		super(b, d, s);
		Giamua = giamua;
		Giaban = giaban;
		Time = time;
		Soluongdaban = soluongdaban;
		Nhasanxuat = nhasanxuat;
	}

	public Bang() {
		this.Giaban = 0l;
		this.Giamua = 0l;
		this.Nhasanxuat = " ";
		this.Soluongdaban = 0;
		this.Time = 0;
	}

	@Override
	public String toString() {
		return this.Tuade + "," + this.Giamua + "," + this.Time + "," + this.Nhasanxuat + "," + this.Soluongdaban + ","
				+ this.Giaban;
	}

	public void NhapBang() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhập tựa đề: ");
		this.Tuade = scn.nextLine();
		System.out.print("Nhập giá mua về: ");
		this.Giamua = scn.nextLong();
		System.out.print("Nhập thời lượng của ấn phẩm: ");
		this.Time = scn.nextInt();
		System.out.print("Nhập tên của nhà sản xuất: ");
		this.Nhasanxuat = scn.nextLine();
		System.out.print("Nhập tên số lượng ấn phẩm bán ra: ");
		this.Soluongdaban = scn.nextInt();
		System.out.println("Giá bán của ấn phẩm: ");
		this.Giaban = scn.nextLong();
	}
//	abstract float Tong();
}