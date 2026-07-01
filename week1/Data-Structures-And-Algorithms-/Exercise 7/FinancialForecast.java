public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Case
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;   // Initial investment
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;

        System.out.println("===== FINANCIAL FORECASTING =====");
        System.out.println("Current Value : ₹" + currentValue);
        System.out.println("Growth Rate   : " + (growthRate * 100) + "%");
        System.out.println("Years         : " + years);

        double future = futureValue(currentValue, growthRate, years);

        System.out.printf("\nPredicted Future Value after %d years = ₹%.2f\n",
                years, future);

        // Analysis
        System.out.println("\n===== TIME COMPLEXITY ANALYSIS =====");
        System.out.println("Time Complexity  : O(n)");
        System.out.println("Space Complexity : O(n)");
        System.out.println("\nReason:");
        System.out.println("The recursive function makes one recursive call");
        System.out.println("for each year until it reaches the base case.");

        System.out.println("\n===== OPTIMIZATION =====");
        System.out.println("The recursive solution can be optimized by:");
        System.out.println("1. Using iteration instead of recursion.");
        System.out.println("2. Using the mathematical formula:");
        System.out.println("   Future Value = Present Value × (1 + r)^n");
        System.out.println("3. Using memoization when recursive calculations");
        System.out.println("   involve repeated subproblems.");
    }
}
