package com.longltt2008110275.tuan1;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        int theTich;
        int canh1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của khối lập phương: ");
        canh1 = sc.nextInt();
        theTich = canh1*canh1*canh1;
        System.out.printf("Thể tích của khối lập phương là: %d", theTich);
        
        
    }
}
