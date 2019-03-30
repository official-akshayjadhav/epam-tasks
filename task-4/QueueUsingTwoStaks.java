import java.io.*;
import java.util.*;

public class QueueUsingTwoStaks {

    Stack<Integer> shiftStk(Stack<Integer> stk1, Stack<Integer> stk2){
        while(!stk1.empty())
            stk2.push(stk1.pop());

        return stk2;
    }


    public static void main(String[] args) {
        QueueUsingTwoStaks s = new QueueUsingTwoStaks();

        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();
        int t, d;

        while(queries-- > 0){
            t = sc.nextInt();

            if(t == 1){
                d = sc.nextInt();
                stk1.push(d);
             
            }
            else if(t == 2){
                if(stk2.isEmpty()){
                    stk2 = s.shiftStk(stk1, stk2);
                }
                stk2.pop();
            }
            else{
                if(stk2.isEmpty()){
                    stk2 = s.shiftStk(stk1, stk2);
                }
                System.out.println(stk2.peek());
            }
        }
    }
}
