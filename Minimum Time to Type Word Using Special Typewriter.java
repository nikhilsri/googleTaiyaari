class Solution {
    public int minTimeToType(String word) {
        int counter=0;
        char c='a';
        for(int i=0;i<word.length();i++){                        
                counter+=Math.min(26-(Math.abs((int)c-(int)word.charAt(i))),(Math.abs((int)c-(int)word.charAt(i))));
                counter++;
                c=word.charAt(i);                      
        }
        return counter;
    }
}
