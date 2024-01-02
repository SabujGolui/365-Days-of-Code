public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		int n = A.size();
        B = B % n; 
		
        reverse(A, 0, B - 1);
        reverse(A, B, n - 1);
        reverse(A, 0, n - 1);

        return A;
	}
	private void reverse(ArrayList<Integer> A, int start, int end) {
        while (start < end) {
            int temp = A.get(start);
            A.set(start, A.get(end));
            A.set(end, temp);
            start++;
            end--;
        }
    }
}
