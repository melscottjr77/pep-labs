import java.util.Scanner;

/**
 * If we want to make programs that "do something", we're going to need to create instructions that change
 * depending on the current state of the program.
 * Therefore, we're inevitably going to run into boolean expressions (ie true/false statements).
 * Let's start with the different ways to compare two numbers, in this case a and b.
 * 
 * Additional Resource if needed: https://www.oreilly.com/library/view/java-for-dummies/9781118239742/a17.html
 */
public class Comparators {
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return 
     * @return true if a is equal to b, false otherwise.
     */
public static void main(String[] args){
    int a = 1;
    int b = 1;
    if (a == b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than b, false otherwise.
     */
    if (a > b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than b, false otherwise.
     */
    if (a < b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is greater than or equal to b, false otherwise.
     */
    if (a >= b){
    System.out.println("true");
    }else{
        System.out.println("false");
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is less than or equal to b, false otherwise.
     */
    if (a <= b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
    /**
     * @param a the first number to be compared.
     * @param b the second number to be compared.
     * @return true if a is not equal to b, false otherwise.
     */
    if (a != b){
        System.out.println("true");
    }else{
        System.out.println("false");
    }
 }
    public boolean isEqualTest1(int a, int b) {
        return true;
    }
    public boolean isEqualTest2(int a, int b) {
        return false;
    }
    public boolean greaterThanOrEqualToTest1(int a, int b) {
        return true;
    }
    public boolean greaterThanOrEqualToTest2(int a, int b) {
        return true;
    }
    public boolean greaterThanOrEqualToTest3(int a, int b) {
        return false;
    }
    public boolean lessThanOrEqualToTest1(int a, int b) {
        return true;
    }
    public boolean lessThanOrEqualToTest2(int a, int b) {
        return true;
    }
    public boolean lessThanOrEqualToTest3(int a, int b) {
        return false;
    }
    public boolean notEqualToTest1(int a, int b) {
        return false;
    }
    public boolean notEqualToTest2(int a, int b) {
        return true;
    }
    public boolean lessThanTest1(int a, int b) {
        return true;
    }
    public boolean lessThanTest2(int a, int b) {
        return false;
    }
    public boolean lessThanTest3(int a, int b) {
        return false;
    }
    public boolean greaterThanTest1(int a, int b) {
        return true;
    }
    public boolean greaterThanTest2(int a, int b) {
        return false;
    }
    public boolean greaterThanTest3(int a, int b) {
        return false;
    }
}