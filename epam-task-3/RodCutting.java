/* 
problem link:
https://www.hackerearth.com/problem/algorithm/rod-cutting-problem-7/

solution: 
solved using bit manipulation. If number having all 1's in it's binary representation,
then this number  will come under 2nd case, so increment counter for only those numbers
*/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class RodCutting {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while((t--) > 0){
            int l = Integer.parseInt(br.readLine());
            int count = 0;
            
            String binary = Integer.toBinaryString(l);
            
            // for actual number
            if(!binary.contains("0")){
                   count++;
            }
            
            int len = binary.length() - 2;
           
            System.out.println(count+len);
        }
    }
}

