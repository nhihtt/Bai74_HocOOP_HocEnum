package tonhi.com.test;

import java.util.ArrayList;

import tonhi.com.model.SinhVien;

public class TestSinhVien {

	public static void main(String[] args) {
		ArrayList<SinhVien> dsSV= new ArrayList<SinhVien>();
		dsSV.add(new SinhVien(1, "Tèo", 7));
		dsSV.add(new SinhVien(2, "Tý", 5));
		dsSV.add(new SinhVien(3, "Lan", 4));
		dsSV.add(new SinhVien(4, "Hương", 9));
		System.out.println("Danh sách sinh viên");
		for(SinhVien sv: dsSV) {
			System.out.println(sv);
		}
		
	}

}
