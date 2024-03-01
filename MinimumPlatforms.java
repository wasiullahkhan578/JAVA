import java.util.Scanner;

public class MinimumPlatforms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter comma-separated arrival times:");
        String arrivalStr = sc.nextLine();
        String[] arrivalArr = arrivalStr.split(",");

        System.out.println("Enter comma-separated departure times:");
        String departureStr = sc.nextLine();
        String[] departureArr = departureStr.split(",");

        int n = arrivalArr.length;

        int[] arrival = new int[n];
        int[] departure = new int[n];

        // Convert string times to integer times
        for (int i = 0; i < n; i++) {
            String[] time = arrivalArr[i].split(":");
            arrival[i] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

            time = departureArr[i].split(":");
            departure[i] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        }

        System.out.println("Minimum number of platforms required: " + findPlatform(arrival, departure, n));
    }

    static int findPlatform(int arrival[], int departure[], int n) {
        int maxPlatforms = 1, currentPlatforms = 1;

        Arrays.sort(arrival); // Sort arrival and departure times
        Arrays.sort(departure);

        int i = 0, j = 0;
        while (i < n && j < n) {
            // If a train arrives, increment the number of platforms
            if (arrival[i] <= departure[j]) {
                currentPlatforms++;
                i++;
            } else {
                // If a train departs, decrement the number of platforms
                currentPlatforms--;
                j++;
            }

            // Update the maximum number of platforms needed
            maxPlatforms = Math.max(maxPlatforms, currentPlatforms);
        }

        return maxPlatforms;
    }
}