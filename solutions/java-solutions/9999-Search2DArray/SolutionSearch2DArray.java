import java.util.Arrays;

class SolutionSearch2DArray {
    public static void main(String[] args) {
        
        int[][] arr = {
            {8, 9 ,10 , 11},
            {2 , 5},
            {54, 21}
        };

        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        
        System.out.println(max(arr));
        
    }
        
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
        
    static int max (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row: arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}