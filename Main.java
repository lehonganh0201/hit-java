package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vegetable> arr = new ArrayList<>();
        while (true){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int i=0;
            switch (n){
                case 1:
                    Vegetable vegetable=new Vegetable(""+(i+1),"Green Chilli","Kg",15,5,10000);
                    arr.add(vegetable);
                    break;
                case 2:
                    Vegetable.prineTitle();
                    for(Vegetable vegetable1:arr){
                        vegetable1.display();
                    }
                    break;
                case 3:
                    Collections.sort(arr, new Comparator<Vegetable>() {
                        @Override
                        public int compare(Vegetable o1, Vegetable o2) {
                            return Integer.compare((int)o1.getTotalRevenue(),(int)o2.getTotalRevenue());
                        }
                    });
                    break;
                case 4:
                    Collections.sort(arr, new Comparator<Vegetable>() {
                        @Override
                        public int compare(Vegetable o1, Vegetable o2) {
                            if(o1.getUnit().compareTo(o2.getUnit())>0){
                                return Integer.compare((int)o1.getTotalRevenue(),(int)o2.getTotalRevenue());
                            }
                            else {
                                return o1.getUnit().compareTo(o2.getUnit());
                            }
                        }
                    });
                    break;
                case 5:
                    Vegetable vegetableSearch=new Vegetable();
                    vegetableSearch.setName(sc.nextLine());
                    for(Vegetable vegetable1:arr){
                        if(vegetable1.getName().compareTo(vegetableSearch.getName()) > 0 ){
                            vegetable1.display();
                        }
                    }
                    break;
                case 6:
                    return;
            }
        }
    }
}
