package com;

import java.util.Locale;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase(Locale.ROOT);
        int cnt1=0,cnt2=0,cnt3=0;
        for(char x:str.toCharArray()){
            if((int)x>=48&&(int)x<=57)
                cnt1++;
            else if ((int)x>=97 && (int)x<=122){
                cnt2++;
            }
            else cnt3++;
        }
        System.out.println(cnt2+" "+cnt1+" "+cnt3);
    }
}
