class RichestCustomerWelth {
    public int maximumWealth(int[][] accounts) {
        // sol 1 (brute-force) 
        // Time - O(m*n) & Space - O(1)
        
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int count = 0;
            for(int j = 0; j < accounts[i].length; j++){
                count += accounts[i][j];
            }
            max = Math.max(max, count);
        }

        return max;
    }
}
