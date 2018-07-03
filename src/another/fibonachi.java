package another;

import java.util.Scanner;

/**
 * Created by shaman on 25.06.2018.
 */
public class fibonachi {

    public static void main(String[] args) {

        System.out.println("Enter number: ");
        int num = new Scanner(System.in).nextInt();

        for (int i = 1; i <= num  ; i++) {
            System.out.println(fibonachirec(i) + " ");
        }
    }

    public static int fibonachi2 (int num){
        if(num==1 || num==2){
            return 1;
        }
        int fib1=1,fib2=1,fibo=1;
        for (int i = 3; i <=num ; i++) {
            fibo=fib1+fib2;
            fib1=fib2;
            fib2=fibo;
        }

        return fibo;
    }

    public static int fibonachirec(int num){
        if(num==1 || num==2){
            return 1;
        }
        return fibonachirec(num-1)+fibonachirec(num-2);
    }

}
