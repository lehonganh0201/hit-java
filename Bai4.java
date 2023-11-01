package com;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        int[] arr=new int[26];
        for(char x:str.toCharArray()){
            arr[x-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
