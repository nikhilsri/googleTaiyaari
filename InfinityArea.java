import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
public class Solution{
    public static void main(String[] args){
        
   InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        
        int t = in.nextInt();
        //System.out.println(t);
        //in.next();
        int counter=1;
        while (t-- > 0) {
            
            int r=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            double area=0.0;
            int radius=r;
            boolean leftCircle=true,rightCircle=false;
            area=area+(3.141592653589793238*radius*radius);
            while(radius!=0){
                if(leftCircle){
                    leftCircle=false;
                    rightCircle=true;
                    radius=radius*a;
                    if(radius!=0)
                        area=area+(3.141592653589793238*radius*radius);
                    //System.out.println("radius left "+radius);
                }
                if(rightCircle){
                    leftCircle=true;
                    rightCircle=false;
                    radius=radius/b;
                    if(radius!=0)
                        area=area+(3.141592653589793238*radius*radius);
                    //System.out.println("radius right "+radius);
                }
                
            }
            DecimalFormat df = new DecimalFormat();
    		df.setMaximumFractionDigits(12);
    		df.setGroupingUsed(false);
    		//System.out.println(df.format(10.121212));
            System.out.println("Case #"+counter+": "+ df.format(area));
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
