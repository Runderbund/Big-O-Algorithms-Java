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

    public static boolean repeatedNamesHashSet(String[] nameList) {
        return true;
    }

    public static int[] sortList(int[] numberList) {
        return numberList;
    }
}


