https://www.geeksforgeeks.org/problems/second-largest3735/1    

int print2largest(int arr[], int n) {
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            } else if (arr[i] > sl && arr[i] != fl) {
                sl = arr[i];
            }
        }

        if (sl == Integer.MIN_VALUE) return -1;
        return sl;
    }