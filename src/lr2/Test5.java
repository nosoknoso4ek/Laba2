package lr2;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число больше 1000");

        int numbers = in.nextInt();

        int delimiter = (numbers / 1000 );

        System.out.printf("Во введенном числе %s тысяч", delimiter);

    }
}











