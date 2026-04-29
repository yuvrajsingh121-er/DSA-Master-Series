import java.util.*;
public class bubbleSorting {
    public static  void bubble_sorting(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int array[]){
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    public static void main(String[] args){
        int array[] ={6, 4, 9, 7, 2,};
        bubble_sorting(array);
        printArray(array);
    }
}

