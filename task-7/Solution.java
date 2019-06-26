import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int q, int p) throws Exception{
        double po = 0;
        long pol = 0;
        if(p == q && q == 0){
            throw(new Exception("n and p should not be zero."));
        }
        if(p < 0 || q < 0){
            throw(new Exception("n or p should not be negative."));
        }
        po = Math.pow(q,p);
        pol = (long)po;
        return pol; 
    }
}
public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
