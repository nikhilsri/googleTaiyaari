import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution{
    public static void main(String[] args){
        
    //URL:- https://codingcompetitions.withgoogle.com/kickstart/round/00000000008cb33e/00000000009e7021
   InputStream inputStream = System.in;

        InputReader in = new InputReader(inputStream);

        //inanner in = new inanner(System.in);
        int t = in.nextInt();
        //System.out.println(t);
        //in.next();
        while (t-- > 0) {

            String i = in.next();
            String p = in.next();
            ans = 0;
            if (p.length() < i.length()) {
                counter++;
                System.out.println("Case #" + counter + ": " + "IMPOSSIBLE");
                //return;
            } else {
                check(i, p);
            }
        }
    }
    static int ans = 0;
    static int counter = 0;

    static void check(String i, String p) {
        counter++;

        Map<Character, Integer> hmi = new TreeMap<Character, Integer>();
        Map<Character, Integer> hmp = new TreeMap<Character, Integer>();
        for (int ii = 0; ii < i.length(); ii++) {
            if (hmi.containsKey(i.charAt(ii))) {
                hmi.put(i.charAt(ii), hmi.get(i.charAt(ii)) + 1);
            } else {
                hmi.put(i.charAt(ii), 1);
            }
        }
        for (int j = 0; j < p.length(); j++) {
            if (hmp.containsKey(p.charAt(j))) {
                hmp.put(p.charAt(j), hmp.get(p.charAt(j)) + 1);
            } else {
                hmp.put(p.charAt(j), 1);
            }
        }
        //System.out.println(hmi);
        //System.out.println(hmp);
        if (hmp.size() < hmi.size()) {
            System.out.println("Case #" + counter + ": " + "IMPOSSIBLE");
            return;
        }

        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {

            if (hmi.containsKey(entry.getKey())) {

                if (hmi.get(entry.getKey()) > entry.getValue()) {
                    System.out.println("Case #" + counter + ": " + "IMPOSSIBLE");
                    return;
                } else {
                    ans += (entry.getValue() - hmi.get(entry.getKey()));
                }
            } else {
                if (hmp.size() == hmi.size()) {
                    
                    System.out.println("Case #" + counter + ": " + "IMPOSSIBLE");
                   
                    return;
                }
                ans += entry.getValue();
                //System.out.println("Case #"+counter+": "+"IMPOSSIBLE");
                //return;
            }

        }
        System.out.println("Case #" + counter + ": " + ans);

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
