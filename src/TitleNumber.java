/**
 * Created by qiqi on 2016/10/28.
 */
public class TitleNumber {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) return 0;
        int number = 0;
        int idx = 0;
        int length = s.length();
        while (idx != length) {
            number += (s.charAt(length - idx - 1) - 'A' + 1) * Math.pow(26, idx);//traverse from right to left,every character is its number multiply the correspondent power of 26
            idx++;
        }
        return number;
    }

    public static void main(String[] args) {
        TitleNumber tn = new TitleNumber();
        String s = "ABC";
        System.out.println(tn.titleToNumber(s));//Output: 731
    }
}
