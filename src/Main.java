import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ////BÀI TẬP 1
//        do {
//            System.out.println("Mời chọn hình: ");
//            System.out.println("1. Hình chữ nhật");
//            System.out.println("2. Hình vuông");
//            int n = Integer.parseInt(scanner.nextLine());
//            if (n > 2 || n < 1) {
//                System.out.println("Nhập sai, mời nhập lại");
//                continue;
//            }
//            switch (n) {
//                case 1 -> {
//                    do {
//                        System.out.println("Mời nhập chiều dài: ");
//                        float length = Float.parseFloat(scanner.nextLine());
//                        //Kiểm tra điều kiện phải > 0
//                        if (length <= 0) {
//                            System.out.println("Giá trị không hợp lệ, mời nhập lại");
//                            continue;
//                        }
//                        do {
//                            System.out.println("Mời nhập chiều rộng: ");
//                            float width = Float.parseFloat(scanner.nextLine());
//                            if (width <= 0) {
//                                System.out.println("Giá trị không hợp lệ, mời nhập lại");
//                                continue;
//                            }
//                            //Kiểm tra điều kiện dài > rộng
//                            if (width > length) {
//                                System.out.println("Chiều rộng phải nhỏ hơn chiều dài, mời nhập lại!");
//                                continue;
//                            }
//                            Retangle hinhChuNhat = new Retangle(length, width);
//                            hinhChuNhat.dienTich();
//                            hinhChuNhat.chuVi();
//                            System.out.println(hinhChuNhat);
//                            break;
//                        }
//                        while (true);
//                        break;
//                    }
//                    while (true);
//                }
//                case 2 -> {
//                    do {
//                        System.out.println("Mời nhập độ dài cạnh: ");
//                        float side = Float.parseFloat(scanner.nextLine());
//                        if (side <= 0) {
//                            System.out.println("Giá trị không hợp lệ, mời nhập lại");
//                            continue;
//                        }
//                        Square hinhVuong = new Square(side);
//                        hinhVuong.dienTich();
//                        hinhVuong.chuVi();
//                        System.out.println(hinhVuong);
//                        break;
//                    }
//                    while (true);
//                }
//            }
//            break;
//        }
//        while (true);

        ////BÀI TẬP 2
//        do {
//            System.out.println("Mời chọn thông tin: ");
//            System.out.println("1. Bác sĩ.");
//            System.out.println("2. Bệnh nhân.");
//            int input = Integer.parseInt(scanner.nextLine());
//            if (input <= 0 || input > 2) {
//                System.out.println("Nhập sai, mời nhập lại!");
//                continue;
//            }
//            switch (input) {
//                case 1 -> {
//                    System.out.println("Mời nhập thông tin bác sĩ: ");
//                    System.out.println("Tên:");
//                    String name = scanner.nextLine();
//                    do {
//                        System.out.println("Tuổi:");
//                        int age = Integer.parseInt(scanner.nextLine());
//                        if (age <= 0) {
//                            System.out.println("Tuổi không hợp lệ, mời nhập lại!");
//                            continue;
//                        }
//                        System.out.println("Chuyên khoa:");
//                        String specialist = scanner.nextLine();
//                        do {
//                            System.out.println("Số giờ làm việc:");
//                            float workingHours = Float.parseFloat(scanner.nextLine());
//                            if (workingHours <= 0) {
//                                System.out.println("Số giờ không hợp lệ, mời nhập lại!");
//                                continue;
//                            }
//                            //khai báo đối tượng Doctor
//                            //long id = System.currentTimeMillis();  //cho ID ngẫu nhiên theo thời gian thực
//                            Doctor doctor = new Doctor(name, age, specialist, workingHours);
//                            System.out.println(doctor);
//                            break;
//                        }
//                        while (true);
//                        break;
//                    }
//                    while (true);
//                }
//                case 2 -> {
//                    System.out.println("Mời nhập thông tin bệnh nhân: ");
//                    System.out.println("Tên:");
//                    String name = scanner.nextLine();
//                    do {
//                        System.out.println("Tuổi:");
//                        int age = Integer.parseInt(scanner.nextLine());
//                        if (age <= 0) {
//                            System.out.println("Tuổi không hợp lệ, mời nhập lại!");
//                            continue;
//                        }
//                        do {
//                            System.out.println("Số bệnh án:");
//                            int medicalNumber = Integer.parseInt(scanner.nextLine());
//                            if (medicalNumber <= 0) {
//                                System.out.println("Số bệnh án không hợp lệ, mời nhập lại!");
//                                continue;
//                            }
//                            LocalDate hospitalizedDay = LocalDate.now(); //Ngày nhập viện lấy theo thời gian thực
//                            //khai báo đối tượng Patient
//                            //long id = System.currentTimeMillis();  //cho ID ngẫu nhiên theo thời gian thực
//                            Patient patient = new Patient(name, age, medicalNumber, hospitalizedDay);
//                            System.out.println(patient);
//                            break;
//                        }
//                        while (true);
//                        break;
//                    }
//                    while (true);
//                }
//            }
//            break;
//        }
//        while (true);

        ////BÀI TẬP 3
    }
}