class Solution {
    public int minimumPushes(String word) {
        int n = word.length();

        int first = Math.min(n, 8);
        int second = Math.min(Math.max(n - 8, 0), 8);
        int third = Math.min(Math.max(n - 16, 0), 8);
        int fourth = Math.max(n - 24, 0);

        return first
             + second * 2
             + third * 3
             + fourth * 4;
    }
}