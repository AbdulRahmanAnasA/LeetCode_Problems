import java.util.*;

public class PascalTriangle {

    // Method to calculate combinations (nCr), which is "n choose r"
    public static int nCr(int n, int r) {
        long res = 1; // Use long to handle intermediate results and prevent overflow

        // Calculating nCr using the formula: n! / (r! * (n-r)!)
        for (int i = 0; i < r; i++) {
            // Update res with (n-i) factor and divide by (i+1)
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        // Cast result to int before returning
        // This cast is safe if n and r are within the range where int can hold the result
        return (int) res;
    }

    // Method to generate Pascal's Triangle
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>(); // Initialize the outer list to store rows of the triangle

        // Generate each row of Pascal's Triangle
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // Temporary list to store elements of the current row
            
            // Fill the current row with nCr values
            for (int col = 1; col <= row; col++) {
                // Add the value of nCr(row-1, col-1) to the current row
                tempLst.add(nCr(row - 1, col - 1));
            }
            
            // Add the completed row to the result list
            ans.add(tempLst);
        }
        
        // Return the complete Pascal's Triangle
        return ans;
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows for Pascal's Triangle
        
        // Generate Pascal's Triangle with n rows
        List<List<Integer>> ans = pascalTriangle(n);

        // Print each row of Pascal's Triangle
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> row = ans.get(i); // Get the i-th row
            
            // Print all elements of the current row
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            
            // Move to the next line after printing all elements of the current row
            System.out.println();
        }
    }
}
