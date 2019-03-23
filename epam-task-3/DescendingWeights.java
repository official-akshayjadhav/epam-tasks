/*
* problem
* link: https://www.hackerearth.com/practice/algorithms/sorting/bucket-sort/practice-problems/algorithm/sort-the-array-5/
*/

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
       // setup input connection
        Scanner sc = new Scanner(System.in);
        
       // take input: N
       int n = sc.nextInt();
       
       // take input: K
       int k = sc.nextInt();
       
       // array of values
       int []arr = new int[n];
       
       // take input: array
       int i = 0;
       while(sc.hasNextInt()){
           arr[i++] = sc.nextInt();
           if(i == n)
            break;
       }
       
       // Map to group values according t otheir weights 
       Map<Integer, ArrayList<Integer>> data = new HashMap<Integer, ArrayList<Integer>>();
       
       // process values and add them into Map ArrayList according to their weights
       for(i = 0 ; i < n ; i++){
            int w = arr[i]%k;
            if(data.containsKey(w)){
                // add this new value into ArrayList
                data.get(w).add(arr[i]);
            }
            else{
                // create new ArrayList and add element - for first time only
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]); 
                // add ArrayList into data HashMap
                data.put(w, al);
            }
        }
        
        // to store only keys list.
        Set<Integer> keys = data.keySet();

        // convert set of keys into array
        Integer []karray = keys.toArray(new Integer[keys.size()]);

        // sort keys array in descending order
        Arrays.sort(karray, Collections.reverseOrder());

        // traverse the keys
        for(int ki: karray){
            // take ArrayList from data HashMap and sort it in ascending order
            Collections.sort(data.get(ki));

            // print the values of ArrayList
            for(int di: data.get(ki)){
                System.out.print(di+" ");
            }
        }
    }
}
