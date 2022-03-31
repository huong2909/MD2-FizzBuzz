import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzzTranslate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a");
        int a = scanner.nextInt();
    }


    public static String translate(int a){

        int phanChuc = a / 10;
        int phanDonVi = a - phanChuc * 10;
        if (a%3==0 && a%5==0){ return "FizzBuzz";}
        if (a%3==0|| (phanChuc == 3) || (phanDonVi == 3)){
            return "Fizz";
        } else if (a%5==0|| (phanChuc == 5) || (phanDonVi == 5)){
            return "Buzz";
        }
        else return a+"";



    }
}
