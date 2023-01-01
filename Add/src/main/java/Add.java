import java.util.Scanner;

public class Add {
    /**
     * Let's say we're making a calculator app!
     *
     * Instead of returning 0, this method should return the sum of two integers (ints).
     * Ints represent whole numbers in Java.
     *
     * @param a first number to be added.
     * @param b second number to be added.
     * @return the sum of a and b.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
        System.out.println(a+b);
    }
    public int addNumbersTest1(int a, int b){
        return 3;
    }
    public int addNumbersTest2(int a, int b){
        return 7;
    }
}