import com.leetcode.problems.SlidingWindowProblem;
import com.leetcode.problems.Solution;

public class Main {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isSubsequence("ace", "abcde"));

        SlidingWindowProblem slwp = new SlidingWindowProblem();
        slwp.getWindowsLessThen10(new int[] {3,2,1,3,1,1}, 6);
    }
}