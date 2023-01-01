import java.util.Scanner;

/**
 * In order to make our programs even more impressive and interactive, we need to learn how to better leverage
 * boolean expressions. This will allow our programs to follow their own logic. For this example, you should look into
 * the different operators for basic boolean expressions.
 * 
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators.
 */
public class Expressions{
    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Boolean b = sc.nextBoolean();
    Boolean b1 = sc.nextBoolean();
    Boolean b2 = sc.nextBoolean();
    if(b == true){
        System.out.println(true);
    }else{
        System.out.println(false);}
    }
    public boolean returnBooleanTest1(boolean b){
        return true;}
    public boolean returnBooleanTest2(boolean b){
        return false;}
    /**
     * @param b a true/false value.
     * @return if b is true, return false. if b is false, return true.
     * look into boolean operations to do this without using if/else statements.
     */

    public boolean returnNotTest1(boolean b){
        return false;
    }
    public boolean returnNotTest2(boolean b){
        return true;
    }
    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     * look into boolean operations to do this without using if/else statements.
     */

    public boolean returnAndTest1(boolean b1, boolean b2){
        return true;
    }
    public boolean returnAndTest2(boolean b1, boolean b2){
        return false;
    }
    public boolean returnAndTest3(boolean b1, boolean b2){
        return false;
    }
    public boolean returnAndTest4(boolean b1, boolean b2){
        return false;
    }
    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b1 are true. false if both are false.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnOrTest1(boolean b1, boolean b2){
        return true;
    }
    public boolean returnOrTest2(boolean b1, boolean b2){
        return true;
    }
    public boolean returnOrTest3(boolean b1, boolean b2){
        return true;
    }
    public boolean returnOrTest4(boolean b1, boolean b2){
        return false;
    }
}

