package Problems;
//Max Min
public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        int m = A[A.length-1] + A[0];
        
        return m;
    }
}
