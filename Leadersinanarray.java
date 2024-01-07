//Leaders in an array
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int n = A.size();
        
        int maxRight = A.get(n - 1);
        B.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) > maxRight) {
                maxRight = A.get(i);
                B.add(maxRight);
            }
        }
        Collections.reverse(B);

        return B;
    }
}
