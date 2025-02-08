package Recursion_Basics.Lectures;

public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // kaam
        // single choice
        int singleWays = friendsPairing(n - 1);

        // pair choice
        int pair = friendsPairing(n - 2);
        int pairWays = (n - 1) * pair;

        // Total Ways
        int totWays = singleWays + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        int friends = 5;
        int res = friendsPairing(friends);
        System.out.println("Total Ways of Pairing Friends = " + res);
    }
}
