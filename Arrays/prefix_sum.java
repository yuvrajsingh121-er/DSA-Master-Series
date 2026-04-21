import java.util.*;
public class prefix_sum {
    public static void prefix_sum(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];

        for(int i=1; i<prefix.length; i++){
            prefix[0] = prefix[i-1]+array[i];
        }

        for(int i = 0; i<=array.length; i++){
            int start = i;
            for(int j=i; j<array.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;

                }
            }
        }
        System.err.println("Max sum  "+maxSum);
    }
    public static void main(String[] args){
        int array[] ={2,3,4,5};
        prefix_sum(array);
    }
}
