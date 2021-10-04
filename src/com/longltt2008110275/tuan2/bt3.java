package com.longltt2008110275.tuan2;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        System.out.println("Nhap so dien tieu thu:");
        float soDien;
        Scanner sc = new Scanner(System.in);
        soDien = sc.nextFloat();

        if (soDien <=50){
            System.out.println("So tien phai tra:" + soDien * 1000);
        }else if (soDien > 50){
            System.out.println( "So tien phai tra:" + 50 * 1000 + (soDien- 50) * 1200);

        }
    }
}
