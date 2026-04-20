import java.util.*;
public class BruteForce {
    public static void maxSubarray(int array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<=array.length; i++){
            int start = i;
            for(int j=i; j<array.length; j++){
                int end = j;
                for(int k= start; k<=end; k++){
                    currSum += array[k];
                }
                System.out.print(currSum+" ");
                if(maxSum < currSum){
                    maxSum = currSum;

                }
            }
        }
        System.err.println("Max sum  "+maxSum);
    }
    public static void main(String[] args){
        int array[] ={2,3,4,5};
        maxSubarray(array);
    }
}
