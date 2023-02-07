 public static int pageCount(int n, int p) {
    // Write your code here
    int ans=0;
        
        // from where to start turning page (start or end)
        if (n-p >= p-0) {
            ans = (p/2);
        } else if (n-1 == p && p%2 != 0) {
            ans = 1;
        } else {
            ans = (n-p) / 2;
        }
        return ans;

    }

}
