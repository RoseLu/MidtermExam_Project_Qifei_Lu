import java.util.HashSet;
import java.util.Set;

/**
 * Created by qiqi on 2016/10/28.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int idx = 0;

        for (Character c: s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                set.remove(c);
                idx += 2;//that means two of the Character c could be added to the palindrome
            }
        }
        return set.isEmpty()? idx: idx + 1;
        //if set is empty, that means the number of every character is even; if set is not empty, that means the number
        // of some character is odd, but only one character could be put in palindrome in the middle position
    }

    public static void main(String[] args) {
        String s = "AabbbccccDdddd";
        LongestPalindrome lpd = new LongestPalindrome();
        System.out.println(lpd.longestPalindrome(s));//Output: 11
    }
}
