class Solution {
    public int minMaxGame(int[] nums) {
        
        if(nums.length==1) return nums[0];
        int n=nums.length;
        int[] newNums=null;
        boolean breakTrue=false;
        newNums=new int[n/2];
        while(n!=1){
            breakTrue=false;
            for(int i=0;i<n/2;i++){
                if(i==0||breakTrue)
                    newNums=new int[n/2];  
                if(i%2==0){
                    newNums[i]=Math.min(nums[2*i],nums[(2*i)+1]);
                    //System.out.println("Even "+newNums[i]);
                }else{
                    newNums[i]=Math.max(nums[2*i],nums[(2*i)+1]);
                    //System.out.println("Odd" +newNums[i]);
                }
                //System.out.println(Arrays.toString(newNums));
                if((2*i)+1==n-1){
                    breakTrue=true;
                    break;
                }
            }
            
            n=newNums.length;
            nums=new int[n];
            System.arraycopy(newNums, 0, nums, 0, n);
            //System.out.println(Arrays.toString(nums));
        }
        return newNums[0];
    }
}
