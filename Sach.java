package com;

import java.util.Scanner;

public class Sach {
    private int id=n;
    private String tenSach;
    private int namXuatBan;
    private String theLoai;
    private TacGia x;

    public static int n=1;

    public Sach(int id, String tenSach, int namXuatBan, String theLoai, TacGia x) {
        this.id = id;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.x = x;
        n++;
    }

    public Sach() {
        n++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TacGia getX() {
        return x;
    }

    public void setX(TacGia x) {
        this.x = x;
    }

    public void input(Scanner sc){
        this.tenSach=sc.nextLine();
        this.namXuatBan=sc.nextInt();
        sc.nextLine();
        this.theLoai=sc.nextLine();
        this.x=new TacGia();
        this.x.input(sc);
    }

    public void output(){
        System.out.println("Ten sach:"+tenSach);
        System.out.println("Nam xuat ban:"+namXuatBan);
        System.out.println("The loai:"+theLoai);
        this.x.output();
    }
}
