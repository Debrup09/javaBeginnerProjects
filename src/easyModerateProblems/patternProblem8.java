//0-1 Triangle

package easyModerateProblems;

import java.util.Scanner;

public class patternProblem8 {

    public static void pattern(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if (i-j == 0 || i-j == 2) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of lines: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
