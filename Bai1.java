package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai1 {
    public static boolean searchName(ArrayList<Sach> arrayList,String name){
        for(Sach sach:arrayList){
            if(sach.getTenSach().equals(name)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Sach> saches=new ArrayList<>();
        while (true){
            int q=sc.nextInt();
            sc.nextLine();
            switch (q){
                case 1:
                    int n=sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<n;i++){
                        Sach sach=new Sach();
                        sach.input(sc);
                        saches.add(sach);
                    }
                    break;
                case 2:
                    for(Sach sach:saches){
                        sach.output();
                    }
                    break;
                case 3:
                    System.out.println("Nhap ten cuon sach tim:");
                    String name=sc.nextLine();
                    System.out.println(searchName(saches,name));
                    break;
                case 4:
                    Collections.sort(saches, new Comparator<Sach>() {
                        @Override
                        public int compare(Sach o1, Sach o2) {
                            return o1.getX().getTenTacGia().compareTo(o2.getX().getTenTacGia());
                        }
                    });
                    break;
                case 5:
                    return;
            }
        }
    }
}
