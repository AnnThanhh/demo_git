package org.example;

import java.util.Scanner;

public class baitap3 {
    static double diemTrungBinh(double diemToan, double diemLy, double diemHoa){
        double dtb = (diemHoa + diemLy + diemToan)/ 3;
        return dtb;
    }

    static String xepLoai(double dtb){
        String result = "";
        if(0 < dtb && dtb <=5){
            result = "Học sinh yếu";
        } else if (5.1<= dtb && dtb <=6) {
            result = "Học sinh trung bình";
        } else if (6.1<= dtb && dtb <=7) {
            result = "Học sinh khá";
        } else if (7.1<= dtb && dtb <=8) {
            result = "Học sinh giỏi";
        }else if (8.1<= dtb && dtb <=10){
            result = "Học sinh xuất sắc";
        }else {
            result = "vui lòng nhập lại";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.println("Nhập điểm toán: ");
        double diemToan = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double diemHoa = scanner.nextDouble();

        //process
        double dtb = diemTrungBinh(diemToan, diemLy, diemHoa);
        String danhGia = xepLoai(dtb);

        System.out.println(danhGia);
    }
}
