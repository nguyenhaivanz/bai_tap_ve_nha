package Bai_on_tap;

public class TinhLaiKep {
    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Lãi kép sau " + t + " năm là : "+cinterest);
        System.out.println("Số tiền có được sau " + t + " năm là: "+amount);
    }
    public static void main(String args[]) {
        TinhLaiKep obj = new TinhLaiKep();
        obj.calculate(2000, 5, .08, 12);
    }
}

