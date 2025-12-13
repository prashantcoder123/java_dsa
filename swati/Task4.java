import java.util.Scanner;

public class Task4 {

    public static int compute(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Ensure s2 is the shorter string for less memory use
        if (n < m) {
            return compute(s2, s1);
        }

        int[] previous = new int[m + 1];
        int[] current = new int[m + 1];

        // Initialize the first row
        for (int j = 0; j <= m; j++) {
            previous[j] = j;
        }

        // Fill the DP table using only two rows
        for (int i = 1; i <= n; i++) {
            current[0] = i;
            for (int j = 1; j <= m; j++) {
                int cost = s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 1;
                current[j] = Math.min(
                        Math.min(current[j - 1] + 1, previous[j] + 1),
                        previous[j - 1] + cost
                );
            }

            // Swap current and previous arrays
            int[] temp = previous;
            previous = current;
            current = temp;
        }

        return previous[m];
    }

    // Test the optimized function
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);       
        String str1=in.nextLine(); //first string
        String str2=in.nextLine(); //second string
        System.out.println(compute(str1,str2)); //print the edit distance
    }
}
