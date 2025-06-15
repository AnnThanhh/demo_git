package org.example;

import java.util.Scanner;

public class Main {
    //snippet
    public static void main(String[] args) {
        //lệnh xuất
        System.out.println("Hello Testing05");
        System.out.println("Hello Mentor");

        //snippet lệnh xuất - gõ sout
        System.out.println("hello Cybersoft");

        //comment nhanh - ctrl + / hoặc macbook command + /

        //lệnh nhập
        Scanner scanner = new Scanner(System.in);

        //Biến - nơi lưu trữ dự liệu
        // <kiểu dữ liệu> <tên biến> = <giá trị khởi tạo>

        // kiểu dữ liệu dạng primative value: byte, short, int, long, float, char, boolean, double,.....
        //kiểu dữ liệu tham chiếu: string, array, class, object và interface

        int age = 18;
        double salary = 1500.15;
        String name1 = "Thành";
        boolean isLogin = true; // false

        //hằng số - giá trị không đổi
        final double pi = 3.14159;

        //yêu cầu: cho phép người dùng vào tên mình và xuất ra màn hình
        //ô nhập
//        System.out.println("Nhập tên người dùng: ");
////        nhận giá trị từ người dùng nhập và gắn vào biến
//        String name = scanner.nextLine();
        //xuất ra màn hình
//        System.out.println("Xin chào " + name);

        //yêu cầu: viết chương trình cho sinh viên nhập vào tên, lớp, và tuổi(scanner.nextInt()) và in ra màn hình

        //nhập tên sinh viên
//        System.out.println("Nhập tên sinh viên: ");
//        String ten = scanner.nextLine();

        //nhập lớp
//        System.out.println("Nhập lớp: ");
//        String lop = scanner.nextLine();

        //nhập số tuổi
//        System.out.println("Nhập số tuổi: ");
//        int tuoi = scanner.nextInt();

//        System.out.println("Xin chào " + ten + "," + " Hiện đang " + tuoi + "tuổi" + ", " + "Học lớp " + lop);

        //Quy tắc đặt tên biến
        //bắt buộc bắt đầu bằng chữ cái, không được bắt đầu bằng số, không đưược viết có dấu tiếng việt
        //Không được đặt trùng với từ khóa của java (public, class, void, static,....)
        //Đặt tên theo quy tắc camel case => hoten - hoTen, tongluong - tongLuong
    }
}