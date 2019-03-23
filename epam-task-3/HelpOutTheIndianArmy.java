// import util
import java.util.*;

// comparator class
class SortByLeft implements Comparator<ArrayList<Long>>{
    public int compare(ArrayList<Long> a, ArrayList<Long> b){
        long res = a.get(0) - b.get(0);
        
        if(res == 0)
            return 0;
        else if(res > 0)
            return 1;
        else
            return -1;
    }
}

class HelpOutTheIndianArmy {
    public static void main(String [] args) throws Exception{
        // inittualize scanner class
        Scanner sc = new Scanner(System.in);

        // HashMap to store boundaries of protected areas as a pairs of integers
        List<ArrayList<Long>> pairs = new ArrayList<>();

        // input: N, S, E
        long n = sc.nextLong();
        long s = sc.nextLong();
        long e = sc.nextLong();

        // input:   boundaries i.e x & d
        long x, d, left, right;
        for(int i = 0 ; i < n ; i++){
            x = sc.nextLong();
            d = sc.nextLong();

            // calculate left & right
            left = x - d;
            right = x + d;

            // if left or right is outside the range then discard
            if(left >= e || right <= s)
                continue;
            
            // adjust keft & right
            left = Math.max(s, left);
            right = Math.min(e, right);

            // clear pair
            ArrayList<Long> pair = new ArrayList<>();
            pair.add(left);
            pair.add(right);
            // add pairs into HashMap
            pairs.add(pair);
        }

        // if pairs is empty print complete distance
        if(pairs.size() == 0){
            System.out.println(e-s);
            return;
        }
        // else
        

        // // test: is ArrayList of before sorting
        // System.out.println("array list: ");
        // for(int i = 0 ; i < pairs.size(); i++){
        //     System.out.println(pairs.get(i).get(0)+" "+pairs.get(i).get(1));
        // }

        // sort the pairs
        Collections.sort(pairs, new SortByLeft());

        // // test: is ArrayList sorted
        // System.out.println("sorted array list: ");
        // for(int i = 0 ; i < pairs.size(); i++){
        //     System.out.println(pairs.get(i).get(0)+" "+pairs.get(i).get(1));
        // }
        // for only first element
        left = pairs.get(0).get(0);
        right = pairs.get(0).get(1); 
        
        // init. answer
        long ans = Math.max(0, left-s);

        for(int i = 1 ; i < pairs.size(); i++){
            if(pairs.get(i).get(1) > right){
                ans += Math.max(0, pairs.get(i).get(0) - right);

                // update new right which is maximum that previous
                right = pairs.get(i).get(1);
            }
        }

        // add right most unreserved area if any
        ans = ans + Math.max(0, e - right);

        System.out.println(ans);
    }
}
