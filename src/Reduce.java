public class Reduce {
    public static void main(String[] args) {
        int m = 100;
        int stepCounter = 0;
        while (m != 0) {
            m = reduce(m);
            // System.out.println(m);
            stepCounter += 1;
        }
        // print number of steps to reach 0
        System.out.println("number of steps: " + stepCounter);
    }

    public static int reduce(int n) {
        boolean isEven = n % 2 == 0;
        if (isEven) {
            n = n / 2;
        } else {
            n = n - 1;
        }
        return n;
    }

}
