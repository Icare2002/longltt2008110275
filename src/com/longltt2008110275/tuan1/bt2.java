package com.longltt2008110275.tuan1;

import java.util.Scanner;


public class bt2 {
    public static void main(String[] args) {
        int dai, rong;
        int CV, DT;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng của hình CN: ");
        rong = sc.nextInt();
        System.out.print("Nhập chiều dài của hình CN: ");
        dai = sc.nextInt();
        CV = (dai + rong)*2;
        DT = dai*rong;
        System.out.printf("Chu vi của hình CN là: %d \n", CV);
        System.out.printf("Diện tích cua hình CN là: %d \n", DT);
        System.out.printf("Cạnh nhỏ của hình chữ nhật: %d", Math.min(dai, rong));
        
    }
}
