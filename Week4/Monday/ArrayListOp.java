import java.util.*;

public class ArrayListOp{
    public static void printArrayList(ArrayList<Integer> list){
        System.out.println(list);
    }
    
    public static void selectEven(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0)
                list.remove(i);
        }
        System.out.println(list);
    }

    public static void deleteDuplicate(ArrayList<Integer> list){
        Collections.sort(list);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i-1) == list.get(i))
                list.remove(i);
        }
        System.out.println(list);
    }
    
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(12);
        numbers.add(2);
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        numbers.add(6);
        
        printArrayList(numbers);
        selectEven(numbers);
        deleteDuplicate(numbers);
    }
}