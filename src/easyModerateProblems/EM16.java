// Floyd's triangle

package easyModerateProblems;

import java.util.Scanner;

public class EM16 {

    public static void pattern(int n) {
        int count=1;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();

        pattern(n);
    }
}
