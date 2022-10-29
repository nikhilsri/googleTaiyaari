public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
        int[] dp = new int[c.size()];
        Arrays.fill(dp, 9999);
        dp[0] = 0;
        for(int i = 1;i < c.size();i++){
            if(c.get(i) == 1)continue;
            if(i-2 >= 0){
                dp[i] = Math.min(dp[i-1], dp[i-2]) + 1;
            }else{
                dp[i] = dp[i-1] + 1;
            }
        }
        return dp[c.size()-1];
    }
