package com;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public May() {
    }

    public void nhap(Scanner sc){
        maMay=sc.nextInt();
        sc.nextLine();
        kieuMay=sc.nextLine();
        tinhTrang=sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ma May:"+maMay);
        System.out.println("Kieu may:"+kieuMay);
        System.out.println("Tinh trang may:"+tinhTrang);
    }
}
