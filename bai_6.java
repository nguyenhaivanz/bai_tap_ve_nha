package Bai_on_tap;

public class bai_6 {
    public static void main(String[] args) {
        String sentence = "đ ịt m ẹ a n h đị nh";
        System.out.println("Chuỗi ban đầu: " + sentence);
        sentence = sentence.replaceAll(" ", "");
        System.out.println("khoảng trắng: " + sentence);
    }
}
