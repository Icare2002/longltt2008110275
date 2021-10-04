package com.longltt2008110275.tuan1;

import java.util.Scanner;


public class bt1 {
    public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao ho va ten: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhap ma sinh vien: ");
		long maSinhVien = sc.nextLong();
		
		System.out.println("Nhap vao diem trung binh: ");
		float diemTrungBinh = sc.nextFloat();
		
		System.out.println("-----------");
		System.out.println("Ho va Ten:"+ hoVaTen);
		System.out.println("Ma so sinh vien:"+ maSinhVien);
		System.out.println("Diem Trung Binh:"+ diemTrungBinh);
	}
}
