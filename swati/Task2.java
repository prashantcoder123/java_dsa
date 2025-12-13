import java.util.*;
public class Task2 {

    public static int EditDistance(String s1, String s2,int Ci, int Cd, int Cs) {
        int len1 = s1.length();
        int len2 = s2.length();

        int[][] cost = new int[len1 + 1][len2 + 1];

        // Initialize the base cases
        for (int i = 0; i <= len1; i++) cost[i][0] = i*Cd;
        for (int j = 0; j <= len2; j++) cost[0][j] = j*Ci;

        // Fill the dp table
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    cost[i][j] = cost[i - 1][j - 1]; // No operation needed
                } else {
                    int insert = cost[i][j - 1] + Ci; //insert cost
                    int delete = cost[i - 1][j] + Cd; //delete cost
                    int substitute = cost[i - 1][j - 1] + Cs;//subsitute cost
                    cost[i][j] = Math.min(substitute,Math.min(delete,insert)); //minimum cost
                }
            }
        }

        return cost[len1][len2];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        System.out.print("Enter value of Ci= ");
        int Ci=in.nextInt();
        System.out.print("Enter value of Cd= ");
        int Cd=in.nextInt();
        System.out.print("Enter value of Cs= ");
        int Cs=in.nextInt();
        System.out.println("Minimum cost: "+ EditDistance(str1,str2,Ci,Cd,Cs));
    }
}