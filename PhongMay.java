package com;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap(Scanner sc){
        maPhong=sc.nextLine();
        tenPhong=sc.nextLine();
        x=new QuanLy();
        x.nhap(sc);
        y=new May[n];
        for(int i=0;i<n;i++){
            y[i]=new May();
            y[i].nhap(sc);
        }
    }

    public void xuat(){
        System.out.println("Ma Phong:"+maPhong);
        System.out.println("Ten phong:"+tenPhong);
        x.xuat();
        for(int i=0;i<n;i++){
            y[i].xuat();
        }
    }

    public void timKiem(String tinhTrang){
        for(May may:y){
            if(may.getTinhTrang().equals(tinhTrang)){
                may.xuat();
            }
        }
    }

    public void timKiem(int maMay){
        for(May may:y){
            if(may.getMaMay()==maMay){
                may.xuat();
            }
        }
    }
}
