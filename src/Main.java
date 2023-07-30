import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời chọn hình: ");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình vuông");
            int n = Integer.parseInt(scanner.nextLine());
            if (n > 2 || n < 1) {
                System.out.println("Nhập sai, mời nhập lại");
                continue;
            }
            switch (n) {
                case 1 -> {
                    do {
                        System.out.println("Mời nhập chiều dài: ");
                        float length = Float.parseFloat(scanner.nextLine());
                        //Kiểm tra điều kiện phải > 0
                        if (length <= 0) {
                            System.out.println("Giá trị không hợp lệ, mời nhập lại");
                            continue;
                        }
                        do {
                            System.out.println("Mời nhập chiều rộng: ");
                            float width = Float.parseFloat(scanner.nextLine());
                            if (width <= 0) {
                                System.out.println("Giá trị không hợp lệ, mời nhập lại");
                                continue;
                            }
                            //Kiểm tra điều kiện dài > rộng
                            if (width > length) {
                                System.out.println("Chiều rộng phải nhỏ hơn chiều dài, mời nhập lại!");
                                continue;
                            }
                            Retangle hinhChuNhat = new Retangle(length, width);
                            hinhChuNhat.dienTich();
                            hinhChuNhat.chuVi();
                            System.out.println(hinhChuNhat);
                            break;
                        }
                        while (true);
                        break;
                    }
                    while (true);
                }
                case 2 -> {
                    do {
                        System.out.println("Mời nhập độ dài cạnh: ");
                        float side = Float.parseFloat(scanner.nextLine());
                        if (side <= 0) {
                            System.out.println("Giá trị không hợp lệ, mời nhập lại");
                            continue;
                        }
                        Square hinhVuong = new Square(side);
                        hinhVuong.dienTich();
                        hinhVuong.chuVi();
                        System.out.println(hinhVuong);
                        break;
                    }
                    while (true);
                }
            }
            break;
        }
        while (true);
    }
}