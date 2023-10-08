import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    // Test evenOrOdd
    System.out.println("evenOrOdd: " + evenOrOdd(4));  // true
    System.out.println("evenOrOdd: " + evenOrOdd(5));  // false

    // Test lessThan100
    System.out.println("lessThan100: " + lessThan100(new int[] {90, 100, 10})); // true
    System.out.println("lessThan100: " + lessThan100(new int[] {90, 101, 10})); // false

    // Test repeatedNames
    System.out.println("repeatedNames: " + repeatedNames(new String[] {"Alice", "Bob", "Carol", "Alice"})); // true
    System.out.println("repeatedNames: " + repeatedNames(new String[] {"Alice", "Bob", "Carol"})); // false

    // Test repeatedNamesHashSet
    System.out.println("repeatedNamesHashSet: " + repeatedNamesHashSet(new String[] {"Alice", "Bob", "Alice"})); // true
    System.out.println("repeatedNamesHashSet: " + repeatedNamesHashSet(new String[] {"Alice", "Bob", "Carol"})); // false

    // Test repeatedNamesCompareLength
    System.out.println("repeatedNamesCompareLength: " + repeatedNamesCompareLength(new String[] {"Alice", "Bob", "Alice"})); // true
    System.out.println("repeatedNamesCompareLength: " + repeatedNamesCompareLength(new String[] {"Alice", "Bob", "Carol"})); // false

    // Test sortList
    System.out.println("sortList: " + Arrays.toString(sortList(new int[] {3, 1, 4, 1, 5, 9}))); // [1, 1, 3, 4, 5, 9]
    

    }


    // Time complexity O(1)
    public static boolean evenOrOdd(int number) {
        return number % 2 == 0;
    }

    // Time complexity O(n)
    public static boolean lessThan100(int[] numberList) {
        for (int n : numberList) {
            if (n > 100) {
                return false;
            }
        }
        return true;
    }

    // Time complexity O(n^2)
    public static boolean repeatedNames(String[] nameList) {
        for (int i = 0; i < nameList.length; i++) {
            for (int j = i + 1; j < nameList.length; j++) {
                if (nameList[i].equals(nameList[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    // Time complexity O(n)
    public static boolean repeatedNamesHashSet(String[] nameList) {
        Set<String> nameSet = new HashSet<>();
        for (String name : nameList) {
            if (nameSet.contains(name)) {
                return true;
            }
            nameSet.add(name);
        }
        return false;
    }

    // Time complexity O(n)
    // HashSet can't have duplicates, so we can just compare to array length
    public static boolean repeatedNamesCompareLength(String[] nameList) {
        Set<String> nameSet = new HashSet<>(Arrays.asList(nameList));
        return nameList.length != nameSet.size();
    }

    // Time complexity O(n^2) (Bubble sort)
    public static int[] sortList(int[] numberList) {
        boolean sorted = false;
        int n = numberList.length - 1;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n; i++) {
                if (numberList[i] > numberList[i + 1]) {
                    // No tuple unpacking in Java. Make temp variable to swap.
                    int temp = numberList[i];
                    numberList[i] = numberList[i + 1];
                    numberList[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return numberList;
    }
}


