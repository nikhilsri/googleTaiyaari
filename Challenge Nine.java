import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
    InputStream inputStream = System.in;
    InputReader in = new InputReader(inputStream);
        int t = in.nextInt();
        int counter=1;
        int sum=0,cc=0,min=Integer.MAX_VALUE;
        boolean ccdone=false;
        String ans1="",ans2="",ans3="";
        while (t-- > 0) {
            min=Integer.MAX_VALUE;
            String n = in.next();
           //System.out.println(n);
           if(Integer.parseInt(n)%9==0){
               if(n.length()==1){
                ans3=n.substring(0,n.length())+"0";
               }else{
                ans3=n.substring(0,1)+"0"+n.substring(1);
               }
                
               System.out.println("Case #"+counter+": "+ans3);
           }else{
               int number=Integer.parseInt(n);
               for(int i=1;i<10;i++){
                   if((i+number)%9==0 && n.length()==1){
                       ans1=i+""+number;
                       ans2=number+""+i;
                       min=Math.min(Integer.parseInt(ans1),Integer.parseInt(ans2));
                       break;
                   }else if((i+number)%9==0 && n.length()>1){
                       for(int j=0;j<=n.length();j++){
                           ans1=n.substring(0,j)+i+n.substring(j);
                           min=Math.min(min,Integer.parseInt(ans1));
                           
                           
                       }
                       
                       break;
                   }
               }
            
                System.out.println("Case #"+counter+": "+min);
            
            
           }
            counter++;
        }
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
