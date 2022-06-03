class Solution {
    static int x=0;
    static Map<Integer,Integer> hm=hm=new HashMap<>();
    public int climbStairs(int n) {
        int x=0;       
        hm=new HashMap<>();
        return climbStairs(x,n);
    }
    public int climbStairs(int x,int n){
        if(hm.containsKey(x)) return hm.get(x);
        if(x==n) return 1;
        if(x>n) return 0;
        
        hm.put(x,climbStairs(x+1,n)+climbStairs(x+2,n));
        return hm.get(x);
    }
}
