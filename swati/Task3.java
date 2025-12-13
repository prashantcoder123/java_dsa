import java.util.*;

public class Task3 {

    // Levenshtein Distance function with costs
    public static int levenshteinDistance(String s1, String s2, int Ci, int Cd, int Cs) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] cost = new int[len1 + 1][len2 + 1];

        // Initialize base cases
        for (int i = 0; i <= len1; i++) {
            cost[i][0] = i * Cd;
        }
        for (int j = 0; j <= len2; j++) {
            cost[0][j] = j * Ci;
        }

        // Fill DP table
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    cost[i][j] = cost[i - 1][j - 1]; // No operation needed
                } else {
                    int insert = cost[i][j - 1] + Ci; //insertion cost
                    int delete = cost[i - 1][j] + Cd; //deletion cost
                    int substitute = cost[i - 1][j - 1] + Cs; // substitution cost
                    cost[i][j] = Math.min(substitute,Math.min(delete,insert));
                }
            }
        }
        return cost[len1][len2];
    }

    // Suggest closest words---> word with minimum levenshtein distance(minimum cost)
    public static List<String> suggestWords(String[] dictionary, String input, int ci, int cd, int cs) {
        Map<String, Integer> map = new LinkedHashMap<>();
        int minDis = Integer.MAX_VALUE;

        for (String word : dictionary) {
            int dist = levenshteinDistance(input, word, ci, cd, cs);
            map.put(word, dist);
            minDis = Math.min(minDis, dist);// minimum distance
        }

        // Collect words with minimum distance
        List<String> suggestions = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minDis) {
                suggestions.add(entry.getKey());
            }
        }

        return suggestions;
    }

    // Main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] dictionary = {"cred", "bet", "shat", "that", "brad", "cart", "brat", "card"};            
        int Ci=1;
        int Cd=1;
        int Cs=1;
        System.out.print("Enter the word to be checked: ");
        String input = in.nextLine();  //word to be checked
        List<String> suggestions = suggestWords(dictionary, input, Ci, Cd, Cs);
        System.out.println("Suggested words: " + suggestions);
    }
}