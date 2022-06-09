class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[] arr = new int[2];
        while(i<j)
        {
            if(numbers[i]+numbers[j]<target)
            {
                i++;
            }else if(numbers[i]+numbers[j]>target)
            {
                j--;
            }else
            {
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }
        return arr;    
    }
}
