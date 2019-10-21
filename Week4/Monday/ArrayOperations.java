import java.util.*;

public class ArrayOperations{
    
    public static void printArray(int[] integers){
        for(int integer:integers)
            System.out.print(integer + " ");

        System.out.println("");
    }

    public static int averageValues(int[] m){
        int sum = 0;
        for(int medium: m)
            sum += medium;
        
        return (sum/m.length);
    }

    public static int[] selectEven(int[] array){
        int[] evenArray = new int[array.length];
        int j = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0)
                evenArray[j++] = array[i];
        }
        
        return Arrays.copyOf(evenArray, j);
    }
    
    public static int[] deleteDuplicate(int[] array){
        int[] n = new int[array.length];
        Arrays.sort(array);
        int j = 0;
        
        for(int i = 1; i < array.length; i++){
            if(array[i-1] != array[i])
                n[j++] = array[i-1];
        }

        return Arrays.copyOf(n, j);
    }
    
    public static void main(String[] args){
        int[] numbers = {1, 8, -1, 24, 3};
        int[] average = {10, 4, 5, 2};
        int[] dup = {1, 3, 5, 23, 5 , 1, 7, 7};
        
        printArray(numbers);
        
        System.out.println("Average: " + averageValues(average));
        
        printArray(selectEven(numbers));
        printArray(deleteDuplicate(dup));
    
    }
}