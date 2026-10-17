

class Solution {
    static class Item {
        int value;
        int originalIndex;

        Item(int value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(nums[i], i);
        }

        Arrays.sort(items, (a, b) -> {
            int sa = digitSum(a.value);
            int sb = digitSum(b.value);

            if (sa != sb) {
                return Integer.compare(sa, sb);
            }
            return Integer.compare(a.value, b.value);
        });

        int[] targetPos = new int[n];

        for (int i = 0; i < n; i++) {
            targetPos[items[i].originalIndex] = i;
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || targetPos[i] == i) {
                continue;
            }

            int j = i;
            int cycleLength = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = targetPos[j];
                cycleLength++;
            }

            swaps += cycleLength - 1;
        }

        return swaps;
    }

    private int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
