package com;

import java.util.Scanner;

public class Bai1 {
    public static void print(double length,double width){
        for(int i=0;i<width;i++){
            for(int j=0;j<length;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        switch (str){
            case "HV":
                Square shape=new Square("RED",true,5);
                if(shape.isFilled()){
                    System.out.println("YES");
                    print(shape.getSide(), shape.getSide());
                }
                else{
                    System.out.println("NO");
                }
                System.out.println(shape);
                break;
            case "HCN":
                Rectangle rectangle=new Rectangle("Yellow",true,4,8);
                if(rectangle.isFilled()){
                    System.out.println("YES");
                    print(rectangle.length, rectangle.width);
                }
                else System.out.println("NO");
                System.out.println(rectangle);
                break;
            case "HT":
                Circle circle=new Circle("BLACK",false,3.4);
                System.out.println(circle);
                break;
        }
    }
}
