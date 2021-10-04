package com.longltt2008110275.tuan3;

public class Nhanvien {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien(){

    }

    NhanVien(String teNV, int lg){
        tenNhanVien = teNV;
        luong = lg;
    }

    NhanVien(String dC, String bPLV, String nS){
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
}
