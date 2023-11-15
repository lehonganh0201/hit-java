package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PhongMay phongMay=new PhongMay();
        while (true){
            int q=sc.nextInt();
            sc.nextLine();
            switch (q){
                case 1:
                    phongMay.nhap(sc);
                    break;
                case 2:
                    phongMay.xuat();
                    break;
                case 3:
                    System.out.println("Nhap kieu may can tim:");
                    String tinhTrang=sc.nextLine();
                    phongMay.timKiem(tinhTrang);
                    break;
                case 4:
                    System.out.println("Nhap ma may can tim:");
                    int maMay=Integer.parseInt(sc.next());
                    phongMay.timKiem(maMay);
                    break;
                case 5:
                    return;
            }
        }
    }
}
