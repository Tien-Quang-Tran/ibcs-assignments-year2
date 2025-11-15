import java.util.Scanner;

public class Topic_D {
    int SUM = 0;
    int SUM_CNTR = 0;

    public static void main(String[] args) {
        // Question 1-1:
        /*
         * int N = 5;
         * int S = 0;
         * int R = 0;
         * while (N > 0) {
         * int A = N % 3;
         * if (A == 0) {
         * S = S - N;
         * } else if (A == 1) {
         * S = S + N;
         * } else {
         * S++;
         * }
         * R = R + S;
         * N--;
         * }
         * System.out.println("The result is : " + R);
         */

        // Question 1-2:
        /*
         * int N = 1216;
         * int X = 0;
         * while (N > 0) {
         * X = X + (N % 10);
         * N = N / 10;
         * }
         * System.out.println(X);
         */

        // Question 1-3:
        // COMPUTE(5);

        // Question 1-4:
        // System.out.println(FACTORIAL_ITERATIVE(5));

        // Question 2-1:
        /*
         * Scanner input = new Scanner(System.in);
         * 
         * int HIGHEST = 0;
         * int LOWEST = 0;
         * int COUNTER = 0;
         * 
         * while (COUNTER <= 999) {
         * 
         * System.out.print("Enter a number: ");
         * int NUMBER = input.nextInt();
         * 
         * if (COUNTER == 0) {
         * HIGHEST = NUMBER;
         * LOWEST = NUMBER;
         * }
         * 
         * if (NUMBER > HIGHEST) {
         * HIGHEST = NUMBER;
         * }
         * 
         * if (NUMBER < LOWEST) {
         * LOWEST = NUMBER;
         * }
         * 
         * COUNTER = COUNTER + 1;
         * }
         * 
         * System.out.println("Highest: " + HIGHEST);
         * System.out.println("Lowest: " + LOWEST);
         */

        // Question 2-1, part A and B:
        Topic_D obj = new Topic_D();
        obj.numbers(500);
    }

    public static void COMPUTE(int N) {
        if (N == 0) {
            System.out.println("0");
            return;
        }
        String RESULT = "";
        while (N > 0) {
            int REMAINDER = N % 2;
            RESULT = REMAINDER + RESULT;
            N = N / 2;
        }
        System.out.println(RESULT);
    }

    public static int FACTORIAL_ITERATIVE(int N) {
        int RESULT = 0;
        if (N == 0) {
            RESULT = 1;
        } else {
            RESULT = 1;
            for (int COUNT = N; COUNT >= 1; COUNT--) {
                RESULT = RESULT * COUNT;
            }
        }
        return RESULT;
    }

    public static boolean inRange(int input) {
        if ((input >= 0) && (input <= 1000)) {
            return true;
        } else {
            return false;
        }
    }

    public void numbers(int input) {
        int LOWEST = 1000;
        int HIGHEST = 0;
        if (inRange(input) == true) {
            if (input < LOWEST) {
                LOWEST = input;
            }
            if (input > HIGHEST) {
                HIGHEST = input;
            }
            this.SUM = this.SUM + input;
            this.SUM_CNTR++;
        } else {
            System.out.println("Input is out of range.");
        }
        System.out.println("Average is: " + (this.SUM / this.SUM_CNTR));
    }
}