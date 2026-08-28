class Solution {
    public int myAtoi(String s) {
        String str = s.strip();

        if (str.length() == 0)
            return 0;

        long num = 0;
        int n = 1;
        int start = 0;

        if (str.charAt(0) == '+') {
            start = 1;
        }
        else if (str.charAt(0) == '-') {
            n = -1;
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                break;
            }

            int digit = ch - '0';

            long limit = (n == 1) ? Integer.MAX_VALUE : 2147483648L;

            if (num > limit / 10 ||
                (num == limit / 10 && digit > limit % 10)) {
                return n == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
        }

        return (int)(num * n);
    }
}