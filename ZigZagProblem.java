import java.util.*;

public class ZigZagProblem {
    public static List<Integer> zigzag(List<Integer> sequence) {
        Collections.sort(sequence, Collections.reverseOrder()); // Sort the sequence in descending order
        int midpoint = sequence.size() / 2;
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < midpoint; i++) {
            result.add(sequence.get(i));
            result.add(sequence.get(sequence.size() - i - 1)); // Access element from the end
        }
        if (sequence.size() % 2 != 0) {
            result.add(sequence.get(midpoint));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> zigzagSequence = zigzag(sequence);
        System.out.println(zigzagSequence); // Output: [5, 1, 4, 2, 3]
    }
}
