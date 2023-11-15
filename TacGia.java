package com;

import java.util.Scanner;

public class TacGia {
    private String tenTacGia;
    private int namSinh;

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public TacGia() {
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void input(Scanner sc){
        this.tenTacGia=sc.nextLine();
        this.namSinh=sc.nextInt();
        sc.nextLine();
    }

    public void output(){
        System.out.println("Ten tac gia:"+tenTacGia);
        System.out.println("Nam sinh tac gia:"+namSinh);
    }
}
