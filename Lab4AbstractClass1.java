import java.util.Arrays;

abstract class Robber {

    abstract int RowHouses(int[] moneyInRowHouses);
    abstract int RoundHouses(int[] moneyInRoundHouses);
    abstract int SquareHouse(int[] moneyInSquareHouses);
    abstract int MultiHouseBuilding(int[] moneyInMultiTypeBuilding);

    void RobbingClass() {
        System.out.println("MScAI&ML");
    }

    void MachineLearning() {
        System.out.println("I love MachineLearning.");
    }
}

class JAVAProfessionalRobber extends Robber {

    int RowHouses(int[] moneyInRowHouses) {
        int n = moneyInRowHouses.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return moneyInRowHouses[0];
        }
        int[] dp = new int[n];
        dp[0] = moneyInRowHouses[0];
        dp[1] = Math.max(moneyInRowHouses[0], moneyInRowHouses[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + moneyInRowHouses[i]);
        }
        return dp[n - 1];
    }

    int RoundHouses(int[] moneyInRoundHouses) {
        int n = moneyInRoundHouses.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return moneyInRoundHouses[0];
        }

        int maxRobFirst = moneyInRoundHouses[0] + RowHouses(Arrays.copyOfRange(moneyInRoundHouses, 2, n - 1));
        int maxRobSecond = RowHouses(Arrays.copyOfRange(moneyInRoundHouses, 1, n));

        return Math.max(maxRobFirst, maxRobSecond);
    }

    int SquareHouse(int[] moneyInSquareHouses) {
        int n = moneyInSquareHouses.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return moneyInSquareHouses[0];
        }
        int[] dp = new int[n];
        dp[0] = moneyInSquareHouses[0];
        dp[1] = Math.max(moneyInSquareHouses[0], moneyInSquareHouses[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + moneyInSquareHouses[i]);
        }
        return dp[n - 1];
    }

    int MultiHouseBuilding(int[] moneyInMultiTypeBuilding) {
        int n = moneyInMultiTypeBuilding.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return moneyInMultiTypeBuilding[0];
        }
        int[] dp = new int[n];
        dp[0] = moneyInMultiTypeBuilding[0];
        dp[1] = Math.max(moneyInMultiTypeBuilding[0], moneyInMultiTypeBuilding[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + moneyInMultiTypeBuilding[i]);
        }
        return dp[n - 1];
    }
}

public class Lab4AbstractClass1 {

    public static void main(String[] args) {
        JAVAProfessionalRobber professionalRobber = new JAVAProfessionalRobber();
        professionalRobber.RobbingClass();
        professionalRobber.MachineLearning();

        int[] moneyInRowHouses = {20, 9, 4, 13};
        int maxRobbedRowHouses = professionalRobber.RowHouses(moneyInRowHouses);
        System.out.println("Max Robbed in Row Houses: " + maxRobbedRowHouses);

        int[] moneyInRoundHouses = {20, 9, 4, 13};
        int maxRobbedRoundHouses = professionalRobber.RoundHouses(moneyInRoundHouses);
        System.out.println("Max Robbed in Round Houses: " + maxRobbedRoundHouses);

        int[] moneyInSquareHouses = {5, 10, 2, 7};
        int maxRobbedSquareHouses = professionalRobber.SquareHouse(moneyInSquareHouses);
        System.out.println("Max Robbed in Square Houses: " + maxRobbedSquareHouses);

        int[] moneyInMultiTypeBuilding = {1000, 200, 3, 40, 5, 600};
        int maxRobbedMultiTypeBuilding = professionalRobber.MultiHouseBuilding(moneyInMultiTypeBuilding);
        System.out.println("Max Robbed in Multi Type Houses: " + maxRobbedMultiTypeBuilding);
    }
}
