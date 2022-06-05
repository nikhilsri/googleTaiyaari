import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        
   InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        
        int t = in.nextInt();
        //System.out.println(t);
        //in.next();
        int counter=1,ans=0;
        while (t-- > 0) {
            ans=0;
            String a = in.next();
            String b = in.next();
            if((Integer.parseInt(a) >=1 && Integer.parseInt(a) <= 9)
            && (Integer.parseInt(b) >=1 && Integer.parseInt(b) <= 9)){
                System.out.println("Case #"+counter+": "+ (Integer.parseInt(b)-Integer.parseInt(a)+1));
            }else{
                for(int j=Integer.parseInt(a);j<=Integer.parseInt(b);j++){
                    
                    if(isInteresting(j+"")){
                        ans++;
                    }
                }
                System.out.println("Case #"+counter+": "+ ans);
            }
            counter++;
        }
        
    }
    
    static boolean isInteresting(String number){
        int product=1,sum=0;
        for(int i=0;i<number.length();i++){
            sum+=Integer.parseInt
            (Character.toString(number.charAt(i)));
            product*=Integer.parseInt
            (Character.toString(number.charAt(i)));
        }
        if(product%sum==0){
            return true;
        }
        return false;
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
    
}
