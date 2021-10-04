package com.longltt2008110275.tuan3;

public class xe {
    String tenchuxe;
    String hangsanxuat;
    String dong;
    String giayphep;
    String dungtichxang;

    void inThongTin(){
        System.out.println("Tên Chủ Xe: "+tenchuxe);
        System.out.println("Hãng Sản Xuất: "+hangsanxuat);
        System.out.println("Dòng xe: "+dong);
        System.out.println("Giấy Phép: "+giayphep);
        System.out.println("Dung Tích Xăng "+dungtichxang);
    }

    Xe(){

    }

    Xe(String name, String hsx, String kind){
        tenchuxe = name;
        hangsanxuat = hsx;
        dong = kind;
    }
}
