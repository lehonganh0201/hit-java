package com;

import java.util.Scanner;

public class Bai1 {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static int bcnn(int a,int b){
        return a*b/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(gcd(a,gcd(b,c)));
        System.out.println(bcnn(a,bcnn(b,c)));
    }
}
