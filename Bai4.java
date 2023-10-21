package com;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char c=sc.next().charAt(0);
        int b=sc.nextInt();
        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b==0){
                    System.out.println("Khong chia duoc cho 0");
                }
                else {
                    System.out.println(a*1.0/b);
                }
                break;
        }
    }
}
