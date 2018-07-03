package recurtions;

/**
 * Created by user on 02.07.2018.
 */
public class Golovach {

    public static void main(String[] args) {
        f(1);
    }

    public static void f(int arg) {
        System.out.println(" " + arg);
        if (arg < 7)
            f(2 * arg);
    }
}
