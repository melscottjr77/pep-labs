import java.util.Scanner;

public class CombineStrings {
    /**
     * You can combine two strings using the '+' operator.
     * For instance, String bigstr = str1 + str2.
     * This method should return the combination of two Strings.
     * @param a the first part of the string to be combined.
     * @param b the second part of the string to be combined.
     * @return the combination of strings a and b.
     */
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
    System.out.println(str1+ str2);
    }
    public String combineTest1(String a, String b){
        return "abcxyz";
    }
    public String combineTest2(String a, String b){
        return "123456";
    }

}
