package com;

import java.util.Scanner;

public class Bai3 {
    public static Long dev(String str){
        Long acc=1L;
        for(char x:str.toCharArray()){
            acc*=(x-'0');
        }
        return acc;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(dev(str));
    }
}
