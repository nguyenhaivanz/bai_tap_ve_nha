package Bai_on_tap;
import java.util.Scanner;
public class bai_3 {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn cần kiểm tra:");
        year = scanner.nextInt();
        scanner.close();
        boolean isLeap = false;
        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else {
            }
        }else {
            isLeap = false;
        }
        if(isLeap==true)
            System.out.println(year + " là năm nhuận.");
        else
            System.out.println(year + " không phải là năm nhuận.");
    }
}

