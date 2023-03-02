package QuanLyHocSinh;

import java.util.Scanner;

public class Lop extends HocSinh {
	private String tenLop;
	private HocSinh hocSinh;
	
	public Lop() {}
	public Lop(String hoTen, int tuoi, String queQuan) {
		super(hoTen, tuoi, queQuan);
	}

	public Lop(String hoTen, int tuoi, String queQuan, String tenLop, HocSinh hocSinh) {
		super(hoTen, tuoi, queQuan);
		this.tenLop = tenLop;
		this.hocSinh = hocSinh;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public HocSinh getHocSinh() {
		return hocSinh;
	}

	public void setHocSinh(HocSinh hocSinh) {
		this.hocSinh = hocSinh;
	}
	
	public void nhapThongTinHoSoHocSinh() {
		hocSinh  = new HocSinh();
		hocSinh.nhapThongTinHocSinh();	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập lớp : ");
		tenLop = scanner.nextLine();
		
	}

	public void thongTinHocSinh() {
		hocSinh.displayHocSinh();
		System.out.println("Lớp: " + getTenLop());
	}

}
