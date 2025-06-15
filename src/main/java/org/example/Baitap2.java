package org.example;

import java.util.Scanner;

public class Baitap2 {
    static int tinhTongLuong(int tongGio, int luong1Ngay){
        int tongLuong = tongGio * luong1Ngay;
        return tongLuong;
    }

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
        //mô hình IPO
        //input
        //giá trị từ phía người dùng nhập
        // tổng số giờ làm, số lương 1 giờ
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số giờ làm");
//        int tongGio = scanner.nextInt();
//        System.out.println("Nhập số lương 1 ngày");
//        int luong1Ngay = scanner.nextInt();

        //process
        //giá trị từ người dùng nhập đi thực hiện logic yêu cầu của bài toàn
        //tongLuong = tổng số giờ làm  * số lương 1 giờ
//        int tongLuong = tinhTongLuong(tongGio, luong1Ngay);

        //output
        //giá trị đầu ra từ yêu cầu của đề
        //sout("...")
//        System.out.println(tongLuong);
        //yêu cầu: Viết chương trình đánh giá học sinh, cho phép nhập vào toán, lý, hóa. Tính điểm trung bình và đánh giá học sinh
        //<= 5 : học sinh yếu
        //5.1 - 6: học sinh trung bình
        //6.1 - 7: học sinh khá
        //7.1 - 8: học sinh giỏi
        //8.1 -10 : học sinh xuất sắc
        //Lưu ý: tách hàm tính điểm trung bình
        //và tách hàm xếp loại

        //input
        System.out.println("Nhập điểm toán: ");
        double diemToan = scanner.nextInt();
        System.out.println("Nhập điểm lý: ");
        double diemLy = scanner.nextInt();
        System.out.println("Nhập điểm hóa: ");
        double diemHoa = scanner.nextInt();

        //process
        double dtb = diemTrungBinh(diemToan, diemLy, diemHoa);
        String danhGia = xepLoai(dtb);

        System.out.println(danhGia);
    }
}
