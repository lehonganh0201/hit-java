package com;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String tenQL;

    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public QuanLy() {
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public void nhap(Scanner sc){
        this.maQL=sc.nextLine();
        this.tenQL=sc.nextLine();
    }

    public void xuat(){
        System.out.println("Ma quan ly:"+maQL);
        System.out.println("Ten quan ly:"+tenQL);
    }
}
