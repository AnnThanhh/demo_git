package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        vòng lặp while
//        giá trị ban đầu
//        while(điều kiện){
//            thực hiện logic
//
//            thay đổi giá trị ban đầu
//        }

        //yêu cầu: in ra 5 dòng hello world
        int i = 1; //giá trị ban đầu
        while(i <= 5){ // điều kiện thực hiện vòng lặp
            System.out.println("Hello world"); // thực hiện yêu cầu
            i++; // i = i + 1 hoặc i += 1      thay đổi giá trị ban đầu
        }


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vô số lần: ");
//        int soLan = scanner.nextInt();
//
//        int lan = 1;
//        while(lan <= soLan) {
//            System.out.println("Hello Testing 05");
//            lan++;
//        }


        //vòng lặp do...while
//        giá trị ban đầu
//        do{
//            thực hiện logic
//
//            làm thay đổi giá trị ban đầu
//        }while(điều kiện)

        int index = 1;
        do{
            System.out.println("Giá trị i: " + index);
            index++;
        }while(index <= 5);


        //vòng lặp for
        //for(giá trị khởi tạo; điều kiện; cập nhật giá trị khởi tạo)
        for(int j = 1; j <= 5; j++){
            System.out.println("Giá trị j: " + j);
        }

        //bài tập 1:
        System.out.println("Nhập vào số n: ");
        int n = scanner.nextInt();
        int tong = 0;
        for(int k = 0; k <= n; k++ ){
             tong += k ;
        }
        System.out.println("tổng n = " + tong);

        //bài tập 2:
        System.out.println("Nhập vào số n: ");
        int n2 = scanner.nextInt();
        int tong2 = 0;
//        for(int k = 0; k <= n; k++ ){
//            if(k % 2 == 0){
//                tong2 += k;
//            }
//        }
        //tổng chẳn
        for(int k = 0; k <= n; k+=2 ){
                tong2 += k;
        }
        //chia hết cho 3 => for(int k = 3; k <= n; k +=3){}
        System.out.println("tổng n = " + tong2);
    }
}
