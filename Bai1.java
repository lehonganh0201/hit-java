package com;

import com.google.protobuf.MapEntry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else map.put(x,1);
            max=Math.max(max,map.get(x));
        }
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        int pos=0,res=Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry:entrySet){
            if(entry.getValue()==max){
                if(entry.getKey() < res){
                    res=entry.getKey();
                    pos=entry.getValue();
                }
            }
        }
        System.out.println(res+" "+pos);
    }
}
