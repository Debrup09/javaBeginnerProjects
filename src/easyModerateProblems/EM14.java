//Inverted and Rotated Half Pyramid using *

package easyModerateProblems;

import java.util.Scanner;

public class EM14 {

        public static void pattern(int n) {
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=n; j++) {
                    if (j >= (n+1) - i){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number of Lines: ");
            int n = sc.nextInt();

            pattern(n);
        }
}
