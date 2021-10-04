package com.longltt2008110275.tuan3;

public class sachTestDrive {
    public static void main(String[] args) {
        Sach sach;
        sach = new Sach();
        
        sach.gia=28000;
        sach.nhaXuatBan="NXB Giao duc VN" ;
        sach.giaBan=29000;
        sach.soLuong=1000;

        sach.inThongTin();
        
        sach = new Sach(28000, "NXB Giao duc VN", 29000, 1000);
        System.out.println("Gia: " + sach.gia + " Nha xuat ban: " + sach.nhaXuatBan + " Gia ban: " + sach.giaBan + " So luong: " + sach.soLuong);


        
    }
}
