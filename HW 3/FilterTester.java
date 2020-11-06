// Exercise 1 (20 points)
// Define an interface type Filter as follows:
// public interface Filter <T> {
//  boolean accept(T x);
// }
// Where T is parameterized type aka generic (similarly to Comparable interface).
// Then supply two methods: public static String[] filter(String[] a, Filter<String> f) AND
// public static int[] filter(int[] a, Filter<Integer> f)
// That returns an array containing all elements of a that are accepted by the filter.
// In your program call filter method and :
// 1. filter an array of strings and accepting all strings that contain at least nine characters and
// store it in array called longStrings.
// 2. filter an array of numbers and accepting all non negative numbers, store the result in array
// called positiveNumbersw
// You can use lambda or create a class that implements Filter to supply to filter method.
import java.util.*;

public class FilterTester {

    public static String[] filter(String[] a, Filter<String> f) {
        ArrayList<String> longStrings = new ArrayList<>(); 
        for(String str : a) {
            if(f.accept(str)) {
                longStrings.add(str);
            }
        }
        return longStrings.toArray(new String[0]);
    }

    public static int[] filter(int[] a, Filter<Integer> f) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>(); 
        for(int n : a) {
            if(f.accept(n)) {
                positiveNumbers.add(n);
            }  
        }

        return positiveNumbers.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) { 
        StringFilter strF = new StringFilter();
        IntFilter intF = new IntFilter();
        String[] stringsToFilter = {"short", "loooooong", "shorter", "loooooonger", "loooooongest", "shortest", "longString"};
        int[] intsToFilter = {-6, -3, 2, 6, 12, -36, 73, -88, -109};
        
        String[] longStrings = filter(stringsToFilter, strF);
        int[] positiveNumbers = filter(intsToFilter, intF);
    
        System.out.println("\nString array before filter: ");
        for(String str: stringsToFilter) {
            System.out.print(str + " ");
        }
    
        System.out.println("\nString array after filter: ");
        for(String str: longStrings) {
            System.out.print(str + " ");
        }
    
        System.out.println("\nInteger array before filter: ");
        for(int n: intsToFilter) {
            System.out.print(n + " ");
        }
    
        System.out.println("\nInteger array after filter: ");
        for(int n: positiveNumbers) {
            System.out.print(n + " ");
        }
    
    }
}
