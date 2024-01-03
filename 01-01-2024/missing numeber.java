https://leetcode.com/problems/missing-number/description/

    public int missingNumber(int[] arr) {
        int n = arr.length;
        boolean nPresent = false;
        int indexOf0 = -1;
        for (int i = 0; i < n; i++)
            if (Math.abs(arr[i]) == n) nPresent = true;
            else {
                if (arr[i] == 0) indexOf0 = i;
                arr[Math.abs(arr[i])] *= -1;
            }

        if (!nPresent) return n;
        for (int i = 0; i < n; i++) if (arr[i] > 0) return i;
        return indexOf0;
    }