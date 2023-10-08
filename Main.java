public class Main {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));  // true
        System.out.println(evenOrOdd(5));  // false
    }


    public static boolean evenOrOdd(int number) {
        return number % 2 == 0;
    }

    public static boolean lessThan100(int[] numberList) {
        for (int n : numberList) {
            if (n > 100) {
                return false;
            }
        }
        return true;
    }

    public static boolean repeated_names(String[] nameList) {
        return true;
    }

    public static boolean repeated_names_set(String[] nameList) {
        return true;
    }

    public static int[] sortList(int[] numberList) {
        return numberList;
    }
}


