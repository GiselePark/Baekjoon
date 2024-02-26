package Calculator;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>0&&num2<10){
            int result = num1*num2;
        }
        System.out.println(num1*num2);

    }
}
