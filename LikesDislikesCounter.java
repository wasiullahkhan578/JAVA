import java.util.Scanner;

public class LikesDislikesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Bob's likes and dislikes
        String bobLikesDislikes = scanner.nextLine().trim();

        // Input for Alice's likes and dislikes
        String aliceLikesDislikes = scanner.nextLine().trim();

        // Count the number of topics both like or dislike
        int count = countMatchingTopics(bobLikesDislikes, aliceLikesDislikes);

        // Output the result
        System.out.println(count);

        scanner.close();
    }

    private static int countMatchingTopics(String bob, String alice) {
        int count = 0;

        // Assuming both strings have the same length
        for (int i = 0; i < bob.length(); i++) {
            if (bob.charAt(i) == alice.charAt(i)) {
                // Topics are liked or disliked by both
                count++;
            }
        }

        return count;
    }
}