package com.longltt2008110275.tuan3;

public class xeTestDrive {
    public static void main(String[] args) {

        Xe xe;
        xe = new Xe();
        
        xe.tenchuxe = "Nguyễn Văn B";
        xe.hangsanxuat = "Honda";
        xe.dong = "Tay ga";
        xe.giayphep = "Có";
        xe.dungtichxang = "100 lít";

        xe.inThongTin();

        xe = new Xe("Nguyễn Văn C", "Suzuky", "Tay ga");
        System.out.println("\nTên chủ xe: "+xe.tenchuxe+"\nHãng sản xuất: "+xe.hangsanxuat+"\nDòng xe: "+xe.dong);
    }
}
