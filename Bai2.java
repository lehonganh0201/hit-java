package com;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> employees=new ArrayList<>();
        while (true){
            System.out.println("1.Nhap nhan vien:");
            System.out.println("2.In thong tin:");
            System.out.println("3.Sap xep nhan vien:");
            System.out.println("4.Tim kiem nhan vien:");
            System.out.println("5.Xoa nhan vien:");
            System.out.println("6.Thoat");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:
                    System.out.println("Nhap loai nhan vien:");
                    String str=sc.nextLine();
                    Employee employee;
                    if(str.equals("PartTime")){
                        employee=new PartTimeEmployee("Le Hong Anh",1000000,16);
                    }
                    else {
                        employee=new FullTimeEmployee("Le Hong Anh",1500000);
                    }
                    employees.add(employee);
                    break;
                case 2:
                    for(Employee employee1:employees){
                        System.out.println("Ho ten:"+employee1.getName());
                        System.out.println("Luong moi gio:"+employee1.getPaymentPerHour());
                        if (employee1 instanceof PartTimeEmployee){
                            System.out.println("Gio lam:"+((PartTimeEmployee) employee1).getWorkingHours());
                            System.out.println();
                        }
                        else{
                            System.out.println("Gio lam:"+ 8);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    Collections.sort(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return o2.calculateSalary() - o1.calculateSalary();
                        }
                    });
                    break;

                case 4:
                    Employee employee1=Collections.max(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return o2.getPaymentPerHour()-o1.getPaymentPerHour();
                        }
                    });
                    System.out.println("Ho Ten:"+employee1.getName());
                    System.out.println("Luong moi gio:"+employee1.getPaymentPerHour());
                    System.out.println("Gio lam:"+employee1.calculateSalary()/employee1.getPaymentPerHour());
                    System.out.println();
                    break;

                case 5:
                    Employee employee2=Collections.min(employees, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee o1, Employee o2) {
                            return o2.getPaymentPerHour()-o1.getPaymentPerHour();
                        }
                    });
                    employees.remove(employee2);

                case 6:
                    return;
            }
        }
    }
}
