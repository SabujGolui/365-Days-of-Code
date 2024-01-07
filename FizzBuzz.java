//FizzBuzz
public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> b = new ArrayList<>();

        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                b.add("FizzBuzz");
            } else if (i % 3 == 0) {
                b.add("Fizz");
            } else if (i % 5 == 0) {
                b.add("Buzz");
            } else {
                b.add(String.valueOf(i));
            }
        }

        return b;
    }
}
