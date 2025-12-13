// ek acchee developer ne kaha hai ....
//ek accha developer wahi hai jo code me comment deta hai........
// clarity is key to clean code.
public class move_on_kya_hota_hai {
    public static void main(String[] args) {
        // Trying to define "move on"
        String breakup = "Relationship failed"; // Classic situation
        boolean crying = true; // Crying mode ON
        System.out.println("Move on? Wo kya hota hai?");
        // Logic to "move on"
        int chocolatesEaten = 0;
        int moviesWatched = 0;
        int motivationalQuotesRead = 0;
        // Time to move on!
        while (crying) {
            System.out.println("Still crying... trying to move on...");
            chocolatesEaten++;
            moviesWatched++;motivationalQuotesRead++;
            if (chocolatesEaten > 3 && moviesWatched > 7 &&
             motivationalQuotesRead > 9) {
                crying = false; // Crying mode OFF
            }
        }
        System.out.println("Finally moved on!");
        System.out.println("Chocolates eaten: " + chocolatesEaten);
        System.out.println("Movies watched: " + moviesWatched);
        System.out.println("Motivational quotes read: " + motivationalQuotesRead);
        System.out.println("Move on ka matlab samajh aa gaya!");
}
}