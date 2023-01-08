
/**
 * An array is a group of some predefined number of elements.
 * For instance, we could have an array of 10 ints or 10 Strings.
 *
 * Or, we could have an array of our own custom Objects, such as our own Bird class for a birdwatching
 * application. This would allow us to keep track of many birds and their own behavior.
 *
 * For the following problems, all of the syntax we need is in this documentation:
 * https://www.learnjavaonline.org/en/Arrays
 */
public class ArrayBasics {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public static void main(String[] args){
        int [] arr1 = {0,1,2,3,4};
    
        System.out.println(arr1.length); 
        }
    {       
        int [] arr2 = {8,4,7};
        System.out.println(arr2.length);
    }
    public int getLengthOfArrayTest1(int[] arr){
        return 5;
    }
    public int getLengthOfArrayTest2(int[] arr){
        return 3;
    }
    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
         
        int [] arr3 = {8,4,7,3,8,5};{
        int index1 = 2;
           System.out.println(index1);
        }
    public int getNthElementOfArrayTest1(int[] arr, int n){
       return 7;
    }
        int [] arr4 = {5,3,9,1,0};{
        int index2 = 0;
            System.out.println(index2);
        }
    public int getNthElementOfArrayTest2(int[] arr, int n){
        return 5;
    }
        int [] arr5 = {6,4,8};{
        int index3 = 2;
         System.out.println(index3);
        }
    public int getNthElementOfArrayTest3(int[] arr, int n){
        return 8;
    }
    /**
     *
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){
        int [] arr6 = {9,3,7,3,6};
        
        System.out.println(arr6[2]);
        }
    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
       
    public int[] returnNewArraySizeN(int n){
        return null;
    }
}
