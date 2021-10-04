package com.longltt2008110275.tuan1;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        double delta;
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = sc.nextInt();
        System.out.print("Nhap b = ");
        b = sc.nextInt();
        System.out.print("Nhap c = ");
        c = sc.nextInt();
        delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("Delta = %.2f", delta);
        
    }
    
}
