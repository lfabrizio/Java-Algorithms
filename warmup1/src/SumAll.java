import java.util.Scanner;

public class SumAll {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
                int one = in.nextInt();


        System.out.print("Input second number: ");
        int two = in.nextInt();


        System.out.println(one + "+" + two + "=" + (one+two));
        System.out.println(one- two);
        System.out.println(one*two);
        System.out.println(one/two);
        System.out.println(one%two);
    }

}
