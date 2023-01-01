import java.util.Scanner;

public class GreaterOrLesser {
    /**
     * Let's say part of a calculator app has to judge whether one number is bigger than another. This problem will
     * require you to use an if/else statement.
     *
     * @param a first number to be compared.
     * @param b second number to be compared.
     * @return  If a is less than b, return the string "Lesser". if a is greater than b, return "Greater".
     *          If neither is true, return "Equal". This problem is case-sensitive!
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A < B)
        System.out.println("Lesser");
        if(A > B)
        System.out.println("Greater");
        if(A == B)
        System.out.println("Equal");
        }
    public String decide1(int A, int B){
        return "Equal";
    }
    public String decide2(int A, int B){
        return "Greater";
    }
    public String decide3(int A, int B){
        return "Lesser";
    }
    
}