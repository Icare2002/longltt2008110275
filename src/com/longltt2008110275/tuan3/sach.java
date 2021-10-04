package com.longltt2008110275.tuan3;

public class sach {
    double gia;
    String nhaXuatBan;
    double giaBan;
    int soLuong;

    void inThongTin(){
        System.out.println("Gia: " + gia);
        System.out.println("Nha xuat ban: " + nhaXuatBan );
        System.out.println("Gia ban: " + giaBan);
        System.out.println("So luong:" + soLuong);
    }

    Sach(double g, String nha, double gb, int sl){
        gia = g;
        nhaXuatBan = nha;
        giaBan = gb;
        soLuong = sl;
    }

    public Sach() {
    }

}
