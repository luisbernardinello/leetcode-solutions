
public class Solution1672 {

    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3},
            {3, 2, 1}
        };
        int ans = maximumHealth(matrix);

        System.out.println(ans);


    }

    public static int maximumHealth(int[][] accounts) {

       int ans = Integer.MIN_VALUE;
        for (int[] row: accounts) {
            int sum = 0;
            for (int element : row) {
                 sum += element;
                 
              
            }

            if (sum > ans) {
                ans = sum;
            }
            
        }
        
        return ans;
    }
}
