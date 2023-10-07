public class Main {
    public static void main(String[] args) {
        System.out.println(evenOrOdd(4));  // rrue
        System.out.println(evenOrOdd(5));  // false
    }


    public static boolean evenOrOdd(int num) {
        return num % 2 == 0;
    }
}


