package Problems;
public class Solution {
    public String solve(String A) {
        
        String[] w = A.split("\\s+");
        StringBuilder rw = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            rw.append(w[i]).append(" ");
        }
        return rw.toString().trim();
    }
}
