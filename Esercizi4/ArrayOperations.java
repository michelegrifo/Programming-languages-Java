import java.util.*;

public class ArrayOperations{
    
    public static void printArray(int[] integers){
        
        System.out.print("[");
        for(int i = 0; i < integers.length; i++){
            System.out.print(integers[i]);
            if(i != integers.length - 1)
                System.out.print(", ");
        }
        
        System.out.println("]");
    }

    public static double averageValues(int[] m){
        double sum = 0;
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
    
    public static boolean contains(int [] a, int n){
        boolean check = false;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] == n){
                check = true;
                break;
            }
        }
    
        return check;
    }


    public static int[] deleteDuplicate(int[] array){
        int[] n = new int[array.length];
        int c = 0, r = 0;
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length; j++){
                if(array[j] == array[i])
                    c++;
            }
            
            if(c > 1 && !contains(n, array[i]))
                n[r++] = array[i];
        }
        return Arrays.copyOf(n, r);
    }
    
    public static void main(String[] args){
        int[] numbers = {1, 8, -1, 24, 3};
        int[] average = {10, 4, 5, 2};
        int[] dup = {3, 3, 3, 3};
        
        printArray(numbers);
        
        System.out.println("Average: " + averageValues(average));
        
        printArray(selectEven(numbers));
        printArray(deleteDuplicate(dup));
    
    }
}