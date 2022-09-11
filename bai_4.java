package Bai_on_tap;
import java.util.Scanner;
public class bai_4 {
    public static void main(String[ ] arg)
    {
        boolean isVowel=false;;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra : ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch(ch)
        {
            case 'c' :
            case 'o' :
            case 'd' :
            case 'e' :
            case 'g' :
            case 'y' :
            case 'm' :
            case 'v' :
            case 'a' :
            case 'U' : isVowel = true;
        }
        if(isVowel == true) {
            System.out.println(ch+" Là nguyên âm");
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" Là phụ âm");
            else
                System.out.println("Không nằmtrong bảng chữ cái!");
        }
    }
}

