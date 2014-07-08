/**
 * Created with IntelliJ IDEA.
 * User: rbhatnagar2
 * Date: 7/8/14
 * Time: 6:43 AM
 * To change this template use File | Settings | File Templates.
 */

/**
 * Given a positive integer N, count all possible distinct binary strings of length N such that there are no consecutive 1′s.
 * Input:  N = 2
 * Output: 3 // The 3 strings are 00, 01, 10

 * Input: N = 3
 * Output: 5 // The 5 strings are 000, 001, 010, 100, 101
 */

public class countString {
    private static int countStrings(int n) {
        // a[i] be the number of binary strings of length i which do not contain any two consecutive 1’s and which end in 1
        int[] a = new int[n];
        // b[i] be the number of binary strings of length i which do not contain any two consecutive 1’s and which end in 0
        int[] b = new int[n];
        // Base case
        a[0] = b[0] = 1;

        for (int i=1; i<n ; i++) {
            a[i] = b[i-1];
            b[i] = a[i-1] + b[i-1];
        }
        // The total number of strings of length i is just a[i] + b[i]
        return a[n-1] + b[n-1];
    }

    public static void main(String[] args) {
        //System.out.println("Number of String formed : " + countStrings(0));
        System.out.println("Number of String formed : " + countStrings(1));
        System.out.println("Number of String formed : " + countStrings(2));
        System.out.println("Number of String formed : " + countStrings(3));
        System.out.println("Number of String formed : " + countStrings(4));
        System.out.println("Number of String formed : " + countStrings(5));
        System.out.println("Number of String formed : " + countStrings(6));
        System.out.println("Number of String formed : " + countStrings(7));
        System.out.println("Number of String formed : " + countStrings(8));
        System.out.println("Number of String formed : " + countStrings(9));
        System.out.println("Number of String formed : " + countStrings(10));

    }

}
