package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Test {
    static List<Subject> subjects = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Nhập 1 tiết học mới");
            System.out.println("2. Hiển thị danh sách tiết học");
            System.out.println("3. Sắp xếp môn học theo thứ tự thời gian kết thúc tăng dần");
            System.out.println("4. Lựa chọn môn học");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addNewSubject(scanner);
                    break;
                case 2:
                    displaySubjects();
                    break;
                case 3:
                    sortSubjectsByEndTime();
                    break;
                case 4:
                    chooseSubject(scanner);
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    private static void addNewSubject(Scanner scanner) {
        System.out.println("Nhập thông tin tiết học mới:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Tên môn học: ");
        String subjectName = scanner.nextLine();
        System.out.print("Số lượng sinh viên: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Thời gian bắt đầu (theo định dạng giờ:phút, ví dụ 8:50): ");
        String timeStart = scanner.nextLine();
        System.out.print("Thời gian kết thúc (theo định dạng giờ:phút, ví dụ 9:40): ");
        String timeEnd = scanner.nextLine();
        subjects.add(new Subject(id, subjectName, studentCount, timeStart, timeEnd));
    }

    private static void displaySubjects() {
        for (Subject subject : subjects) {
            System.out.println("ID: " + subject.getId() +
                    ", Tên môn học: " + subject.getSubjectName() +
                    ", Số lượng sinh viên: " + subject.getSubjectCount() +
                    ", Thời gian bắt đầu: " + subject.getTimeStart() +
                    ", Thời gian kết thúc: " + subject.getTimeEnd());
        }
    }

    private static void sortSubjectsByEndTime() {
        subjects.sort(Comparator.comparing(subject -> {
            String[] endTimeParts = subject.getTimeEnd().split(":");
            return Integer.parseInt(endTimeParts[0]) * 60 + Integer.parseInt(endTimeParts[1]);
        }));
        displaySubjects();
    }

    private static void chooseSubject(Scanner scanner) {
        System.out.print("Nhập thời gian bắt đầu (theo định dạng giờ:phút, ví dụ 8:50): ");
        String start = scanner.nextLine();
        System.out.print("Nhập thời gian kết thúc (theo định dạng giờ:phút, ví dụ 9:40): ");
        String end = scanner.nextLine();
        int maxSubjects = 0;
        List<Subject> chosenSubjects = new ArrayList<>();
        for (Subject subject : subjects) {
            if (compareTimes(subject.getTimeStart(), start) >= 0 && compareTimes(subject.getTimeEnd(), end) <= 0) {
                maxSubjects++;
                chosenSubjects.add(subject);
            }
        }
        System.out.println("Số lượng môn học tối đa trong khoảng thời gian cho trước là: " + maxSubjects);
        System.out.println("Danh sách các môn học trong khoảng thời gian cho trước:");
        for (Subject chosenSubject : chosenSubjects) {
            System.out.println("ID: " + chosenSubject.getId() +
                    ", Tên môn học: " + chosenSubject.getSubjectName() +
                    ", Số lượng sinh viên: " + chosenSubject.getSubjectCount() +
                    ", Thời gian bắt đầu: " + chosenSubject.getTimeStart() +
                    ", Thời gian kết thúc: " + chosenSubject.getTimeEnd());
        }
    }

    private static int compareTimes(String time1, String time2) {
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");
        int hour1 = Integer.parseInt(parts1[0]);
        int hour2 = Integer.parseInt(parts2[0]);
        int minute1 = Integer.parseInt(parts1[1]);
        int minute2 = Integer.parseInt(parts2[1]);
        if (hour1 < hour2) {
            return -1;
        } else if (hour1 > hour2) {
            return 1;
        } else {
            if (minute1 < minute2) {
                return -1;
            } else if (minute1 > minute2) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
